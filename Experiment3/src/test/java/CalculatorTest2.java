// CalculatorTest2.java
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest2 {

    private final Calculator calculator = new Calculator();

    @Test
    public void testExample_Statement_1_5() {
        assertEquals(16, calculator.example(10, 0, 6));
    }

    @Test
    public void testExample_Statement_2_6() {
        assertEquals(10, calculator.example(10, 4, 4));
    }

    @Test
    public void testExample_Statement_3_7() {
        assertEquals(2, calculator.example(2, 0, 6));
    }

}
