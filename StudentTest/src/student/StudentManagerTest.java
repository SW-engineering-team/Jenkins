package student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentManagerTest {

    static StudentManager manager;

    @BeforeAll
    static void setUp() {
        manager = new StudentManager();
    }

    // 1. 학생 추가
    @Test
    @Order(1)
    void testAddStudent() {
        manager.addStudent("홍길동");

        assertTrue(manager.hasStudent("홍길동"));
    }

    // 2. 학생 제거
    @Test
    @Order(2)
    void testRemoveStudent() {
        manager.removeStudent("홍길동");

        assertFalse(manager.hasStudent("홍길동"));
    }

    // 3. 중복 추가 예외 처리
    @Test
    @Order(3)
    void testDuplicateStudentAdd() {
        manager.addStudent("홍길동");

        assertThrows(IllegalArgumentException.class, () -> {
            manager.addStudent("홍길동");
        });
    }

    // 4. 존재하지 않는 학생 제거 예외 처리
    @Test
    @Order(4)
    void testRemoveNonExistingStudent() {

        assertThrows(IllegalArgumentException.class, () -> {
            manager.removeStudent("김철수");
        });
    }
}