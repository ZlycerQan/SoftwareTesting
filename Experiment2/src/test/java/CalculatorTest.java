// CalculatorTest.java

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

//    @Test
//    public void testExample_Statement_cd() {
//        int except = 17;
//        int actual = calculator.example(10, 0, 7);
//        assertEquals(except, actual);
//    }
//
//    @Test
//    public void testExample_Statement_ce() {
//        int except = 32;
//        int actual = calculator.example(10, 0, 12);
//        assertEquals(except, actual);
//    }
//
//    @Test
//    public void testExample_Statement_d() {
//        int except = 3;
//        int actual = calculator.example(8, 3, 7);
//        assertEquals(except, actual);
//    }
//
//    @Test
//    public void testExample_Statement_e() {
//        int except = 6;
//        int actual = calculator.example(6, 3, 7);
//        assertEquals(except, actual);
//    }

    @Test
    public void testExample_Statement_abd() {
        int except = 3;
        int actual = calculator.example(7, 3, 6);
        assertEquals(except, actual);
    }

    @Test
    public void testExample_Statement_abe() {
        int except = 7;
        int actual = calculator.example(7, 3, 5);
        assertEquals(except, actual);
    }

    @Test
    public void testExample_Statement_acd() {
        int except = 16;
        int actual = calculator.example(9, 0, 7);
        assertEquals(except, actual);
    }

    @Test
    public void testExample_Statement_ace() {
        int except = 30;
        int actual = calculator.example(9, 0, 12);
        assertEquals(except, actual);
    }
}
