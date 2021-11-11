import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest2 {

    private final Calculator calculator = new Calculator();

    @Test
    public void testExample_Statement_ace() {
        int except = 10;
        int actual = calculator.example(3, 0, 4);
        assertEquals(except, actual);
    }

    @Test
    public void testExample_Statement_acd() {
        int except = 12;
        int actual = calculator.example(6, 0, 6);
        assertEquals(except, actual);
    }

    @Test
    public void testExample_Statement_abe() {
        int except = 2;
        int actual = calculator.example(2, 1, 3);
        assertEquals(except, actual);
    }

}