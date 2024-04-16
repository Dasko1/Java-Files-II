import files.Add1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Add1Test {

    @Test
    public void testValidAddition() {
        int x = 5;
        int y = 4;
        int expectedSum = 9;

        int actualSum = Add1.add(x, y);

        assertEquals(expectedSum, actualSum, "Valid addition failed.");
    }

    @Test
    public void testNegativeAddition() {
        int x = -5;
        int y = 4;
        int expectedSum = -1;

        int actualSum = Add1.add(x, y);

        assertEquals(expectedSum, actualSum, "Negative addition failed.");
    }

    @Test
    public void testZeroAddition() {
        int x = 0;
        int y = 0;
        int expectedSum = 0;

        int actualSum = Add1.add(x, y);

        assertEquals(expectedSum, actualSum, "Zero addition failed.");
    }
}
