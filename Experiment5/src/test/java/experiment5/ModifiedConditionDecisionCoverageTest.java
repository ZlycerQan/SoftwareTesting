// ModifiedConditionDecisionCoverageTest.java
package experiment5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ModifiedConditionDecisionCoverageTest {

    private final Main main = new Main();

    private final double eps = 1e-4;

    @Test
    public void test1() {
        assertEquals(-1, main.commission(0, 0, 0), eps);
    }

    @Test
    public void test2() {
        assertEquals(9.8, main.commission(1, 1, 1), eps);
    }

    @Test
    public void test3() {
        assertEquals(192.7, main.commission(20, 1, 1), eps);
    }

    @Test
    public void test4() {
        assertEquals(343.6, main.commission(30, 1, 1), eps);
    }

    @Test
    public void test5() {
        assertEquals(-1, main.commission(1, 0, -1), eps);
    }

    @Test
    public void test6() {
        assertEquals(-1, main.commission(1, -1, 1), eps);
    }

}
