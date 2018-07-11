package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayShiftTest {

    @Test
    void insertShiftArray() {
        int[] numbers = {2, 4, 6, 8};
        int n = 5;
        ArrayShift.insertShiftArray(numbers, n);

        int[] expected = {2, 4, 5, 6, 8};
        assertArrayEquals(expected, numbers);
    }
}