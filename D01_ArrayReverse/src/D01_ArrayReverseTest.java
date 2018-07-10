import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class D01_ArrayReverseTest {
    @Test
    public void testEmpty() {
        int[] numbers = {};
        D01_ArrayReverse.reverseArray(numbers);

        int[] expected = {};
        assertArrayEquals(numbers, expected);
    }

    @Test
    public void testReverseArray() {
        int[] numbers = {1, 2, 3, 4, 5};
        D01_ArrayReverse.reverseArray(numbers);

        int[] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(numbers, expected);
    }

    @Test
    public void testRandomArray() {
        int [] numbers = {5, 10, 15, 20, 25};
        D01_ArrayReverse.reverseArray(numbers);

        int[] expected = {25, 20, 15, 10, 5};
        assertArrayEquals(numbers, expected);
    }

    @Test
    public void testLongArray() {
        int [] numbers = {42, 12, 21, 18, 20, 9, 6, 5, 10, 3};
        D01_ArrayReverse.reverseArray(numbers);

        int[] expected = {3, 10, 5, 6, 9, 20, 18, 21, 12, 42};
        assertArrayEquals(numbers, expected);
    }
}