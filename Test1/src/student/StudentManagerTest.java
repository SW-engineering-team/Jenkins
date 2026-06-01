package student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentManagerTest {

	// test
    StudentManager manager;

    @BeforeAll
    void setUp() {
        manager = new StudentManager();
    }

    @Test
    @Order(1)
    void testAddStudent() {
        manager.addStudent("홍길동");

        assertTrue(manager.hasStudent("홍길동"));
    }

    @Test
    @Order(2)
    void testAddDuplicateStudent() {
        assertThrows(IllegalArgumentException.class, () -> {
            manager.addStudent("홍길동");
        });
    }

    @Test
    @Order(3)
    void testRemoveStudent() {
        manager.removeStudent("홍길동");

        assertFalse(manager.hasStudent("홍길동"));
    }

    @Test
    @Order(4)
    void testRemoveNonExistingStudent() {
        assertThrows(IllegalArgumentException.class, () -> {
            manager.removeStudent("김철수");
        });
    }
}