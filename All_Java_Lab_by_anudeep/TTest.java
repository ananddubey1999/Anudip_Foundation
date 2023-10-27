import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TTest {

    public static class MathUtils {
        public int add(int a, int b) {
            return a + b;
        }

        public int sub(int a, int b) {
            return a - b;
        }

        public int multi(int a, int b) {
            return a * b;
        }

        public int div(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("Cannot divide by zero.");
            }
            return a / b;
        }

        public int mod(int a, int b) {
            return a % b;
        }
    }

    @Test
    public void testAdd() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.add(2, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testSub() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.sub(5, 3);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testMulti() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.multi(2, 4);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testDiv() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.div(10, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testDivByZero() {
        MathUtils mathUtils = new MathUtils();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.div(10, 0);
        });
    }

    @Test
    public void testMod() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.mod(10, 3);
        Assertions.assertEquals(1, result);
    }

    public static void main(String[] args) {
        // Run the JUnit tests
        org.junit.runner.JUnitCore.main("MathUtilsTest");
    }
}
