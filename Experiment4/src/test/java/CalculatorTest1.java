import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest1 {

    private final Calculator calculator = new Calculator();
    @Test
    public void testExample_Statement_ace() {
        int except = 12;
        int actual = calculator.example(3, 0, 6);
        assertEquals(except, actual);
    }

    @Test
    public void testExample_Statement_abd1() {
        int except = 1;
        int actual = calculator.example(7, 1, 6);
        assertEquals(except, actual);
    }

    @Test
    public void testExample_Statement_abd2() {
        int except = 2;
        int actual = calculator.example(2, 0, 1);
        assertEquals(except, actual);
    }

}