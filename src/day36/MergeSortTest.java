package day36;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    @Test
    void emptyArrayInputMergeSortTest() {
        int[] inputArr = {};

        int[] actual = MergeSort.sort(inputArr, 0, inputArr.length - 1);
        int[] expected = {};

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

        assertArrayEquals(expected, actual);
    }

    @Test
    void singleArrayInputMergeSortTest() {
        int[] inputArr = {23};

        int[] actual = MergeSort.sort(inputArr, 0, inputArr.length - 1);
        int[] expected = {23};

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

        assertArrayEquals(expected, actual);
    }

    @Test
    void mergeSortTest() {
        int[] inputArr = {8,5,3,4,2,7,1,6};

        int[] actual = MergeSort.sort(inputArr, 0, inputArr.length - 1);
        int[] expected = {1,2,3,4,5,6,7,8};

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

        assertArrayEquals(expected, actual);
    }

    @Test
    void mergeSortWhiteboardInputTest() {
        int[] inputArr = {34, 19, 42, -9, 2018, 0, 2005, 77, 2099};

        int[] actual = MergeSort.sort(inputArr, 0, inputArr.length - 1);
        int[] expected = {-9, 0, 19, 34, 42, 77, 2005, 2018, 2099};

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

        assertArrayEquals(expected, actual);
    }
}