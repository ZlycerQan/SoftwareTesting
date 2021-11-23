// StatementCoverageTest.java
package experiment5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StatementCoverageTest {

    private final Main main = new Main();

    private final double eps = 1e-4;

    @Test
    public void testExample_Statement_a() {
        assertEquals(-1, main.commission(0, 0, 0), eps);
    }

    @Test
    public void testExample_Statement_b() {
        assertEquals(9.8, main.commission(1, 1, 1), eps);
    }

    @Test
    public void testExample_Statement_c() {
        assertEquals(192.7, main.commission(20, 1, 1), eps);
    }

    @Test
    public void testExample_Statement_d() {
        assertEquals(343.6, main.commission(30, 1, 1), eps);
    }

}