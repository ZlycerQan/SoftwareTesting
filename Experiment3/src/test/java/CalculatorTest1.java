// CalculatorTest1.java
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest1 {

    private final Calculator calculator = new Calculator();

    @Test
    public void testExample_Statement_cd() {
        assertEquals(16, calculator.example(10, 0, 6));
    }

    @Test
    public void testExample_Statement_ce() {
        assertEquals(24, calculator.example(10, 0, 4));
    }

    @Test
    public void testExample_Statement_bd() {
        assertEquals(4, calculator.example(10, 4, 6));
    }

    @Test
    public void testExample_Statement_be() {
        assertEquals(2, calculator.example(2, 0, 6));
    }

}