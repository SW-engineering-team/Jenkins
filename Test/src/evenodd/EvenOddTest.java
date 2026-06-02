package evenodd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenOddTest {

    @Test
    void 양수_짝수_판별() {
        EvenOdd calculator = new EvenOdd();
        String result = calculator.checkEvenOdd(10);
        assertEquals("짝수", result);
    }

    @Test
    void 양수_홀수_판별() {
        EvenOdd calculator = new EvenOdd();
        String result = calculator.checkEvenOdd(7);
        assertEquals("홀수", result);
    }

    @Test
    void 영은_짝수() {
        EvenOdd calculator = new EvenOdd();
        String result = calculator.checkEvenOdd(0);
        assertEquals("짝수", result);
    }

    @Test
    void 음수_짝수_판별() {
        EvenOdd calculator = new EvenOdd();
        String result = calculator.checkEvenOdd(-4);
        assertEquals("짝수", result);
    }

    @Test
    void 음수_홀수_판별() {
        EvenOdd calculator = new EvenOdd();
        String result = calculator.checkEvenOdd(-3);
        assertEquals("홀수", result);
    }
}