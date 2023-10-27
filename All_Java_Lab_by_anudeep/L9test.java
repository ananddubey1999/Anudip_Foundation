
import org.junit.Test;
import static org.junit.Assert.*;

public class L9test {

    @Test
    public void testAdd() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSub() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.sub(5, 2);
        assertEquals(3, result);
    }

    @Test
    public void testMulti() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.multi(4, 3);
        assertEquals(12, result);
    }

    @Test
    public void testDiv() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.div(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void testMod() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.mod(10, 3);
        assertEquals(1, result);
    }
}

