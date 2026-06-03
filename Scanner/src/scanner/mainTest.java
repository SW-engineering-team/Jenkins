package scanner;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class mainTest {

    @Test
    void testGugudan2() {
        String result = main.gugudan(2);

        assertTrue(result.contains("2 x 1 = 2"));
        assertTrue(result.contains("2 x 5 = 10"));
        assertTrue(result.contains("2 x 9 = 18"));
    }

    @Test
    void testGugudan7() {
        String result = main.gugudan(7);

        assertTrue(result.contains("7 x 3 = 21"));
        assertTrue(result.contains("7 x 9 = 63"));
    }
}