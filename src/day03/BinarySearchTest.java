package day03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void emptyArray() {
        int[] arr = new int[]{};
        int key = 15;
        int result = BinarySearch.BinarySearch(arr, key);

        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    void sampleArray1() {
        int[] arr = new int[]{4, 8, 15, 16, 23, 42};
        int key = 15;
        int result = BinarySearch.BinarySearch(arr, key);

        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    void sampleArray2() {
        int[] arr = new int[]{11, 22, 33, 44, 55, 66, 77};
        int key = 90;
        int result = BinarySearch.BinarySearch(arr, key);

        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    void bench100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.print(Arrays.toString(arr));
        int key = 47;
        int result = BinarySearch.BinarySearch(arr, key);

        int expected = 47;
        assertEquals(expected, result);
    }

    @Test
    void even100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        System.out.print(Arrays.toString(arr));
        int key = 47;
        int result = BinarySearch.BinarySearch(arr, key);

        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    void bench10000() {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 5;
        }
        System.out.print(Arrays.toString(arr));
        int key = 7500;
        int result = BinarySearch.BinarySearch(arr, key);

        int expected = 1500;
        assertEquals(expected, result);
    }

    @Test
    void bench100000() {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 42;
        }
        System.out.print(Arrays.toString(arr));
        int key = 90846;
        int result = BinarySearch.BinarySearch(arr, key);

        int expected = 2163;
        assertEquals(expected, result);
    }
}