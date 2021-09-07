// CalculatorTest.java
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("计算器测试")
class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    @Tag("normal")
    @DisplayName("第一次加法测试")
    public void addTestFirst() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @Tag("important")
    @DisplayName("第二次加法测试")
    public void addTestSecond() {
        assertEquals(5, calculator.add(7, -2));
    }

    @RepeatedTest(4)
    @Tag("important")
    @DisplayName("第三次加法测试")
    public void addTestThird() {
        assertEquals(4, calculator.add(7, -3));
    }

    @Test
    @Tag("important")
    @DisplayName("第一次减法测试")
    public void minusTestFirst() {
        assertEquals(10, calculator.minus(12, 2));
    }

    @Test
    @Tag("easy")
    @DisplayName("第二次减法测试")
    public void minusTestSecond() {
        assertEquals(0, calculator.minus(0, 0));
    }

    @Test
    @Disabled
    @Tag("normal")
    @DisplayName("第三次减法测试")
    public void minusTestThird() {
        assertEquals(0, calculator.minus(0, 0));
    }

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    @Tag("important")
    @DisplayName("第四次减法测试")
    public void minusTestFourth() {
        assertEquals(-3, calculator.minus(-7, -4));
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before test all.");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before test each.");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After test all.");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After test each.");
    }

}