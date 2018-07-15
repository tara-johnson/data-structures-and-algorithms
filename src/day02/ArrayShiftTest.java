package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayShiftTest {

    @Test
    void singleDigitArrayTest() {
        int[] arr = {1};
        int newVal = 2;
        String result = Arrays.toString(ArrayShift.insertShiftArray(arr, newVal));

        String expected = Arrays.toString(new int[] {1, 2});
        assertEquals(expected, result);
    }

    @Test
    void oddArrayTest() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int newVal = 10;
        String result = Arrays.toString(ArrayShift.insertShiftArray(arr, newVal));

        String expected = Arrays.toString(new int[] {1, 2, 3, 4, 10, 5, 6, 7});
        assertEquals(expected, result);
    }

    @Test
    void evenArrayTest() {
        int[] arr = {2, 4, 6, 8};
        int newVal = 5;
        String result = Arrays.toString(ArrayShift.insertShiftArray(arr, newVal));

        String expected = Arrays.toString(new int[] {2, 4, 5, 6, 8});
        assertEquals(expected, result);
    }
}