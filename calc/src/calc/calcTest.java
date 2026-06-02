package calc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class calcTest {

    @Test
    void testAdd() {
        Calc calc = new Calc();

        int result = calc.add(10, 5);

        assertEquals(15, result);
    }

    @Test
    void testSubtract() {
        Calc calc = new Calc();

        int result = calc.subtract(10, 5);

        assertEquals(5, result);
    }

    @Test
    void testMultiply() {
        Calc calc = new Calc();

        int result = calc.multiply(10, 5);

        assertEquals(50, result);
    }

    @Test
    void testDivide() {
        Calc calc = new Calc();

        double result = calc.divide(10, 5);

        assertEquals(2.0, result);
    }

    @Test
    void testDivideByZero() {
        Calc calc = new Calc();

        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10, 0);
        });
    }
}