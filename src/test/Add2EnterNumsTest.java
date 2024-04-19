import files.Add2EnterNums;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.ByteArrayInputStream;

import static files.Add2EnterNums.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Add2EnterNumsTest {

    @Test
    public void testValidAddition() {
        String input = "5\n4\n"; // Simulate user input
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        int expectedSum = 48;
        int x = 34;
        int y = 14;
        int actualSum = Add2EnterNums.calculateSum(x, y);

        assertEquals(expectedSum, actualSum, "Valid addition failed.");
    }

   /*@Test
    public void testInvalidInput() {
        String input = "abc\n3.14\n"; // Simulate non-integer input
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertThrows(java.util.InputMismatchException.class, Add2EnterNums::calculateSum, "Invalid input not handled.");
    }

    private void assertThrows(Class<InputMismatchException> inputMismatchExceptionClass, Object calculateSum, String s) {
    }*/

    @Test
    public void testZeroAddition() {
        String input = "0\n0\n"; // Simulate zero input
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        int x = 0;
        int y = 0;
        int expectedSum = 0;
        int actualSum = calculateSum(x, y);

        assertEquals(expectedSum, actualSum, "Zero addition failed.");
    }
}
