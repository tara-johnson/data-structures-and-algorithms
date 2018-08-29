package day37;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {
    @Test
    void emptyArrayInputSelectionSortTest() {
        double[] inputArr = {};

        double[] actual = SelectionSort.selectionSort(inputArr);
        double[] expected = {};

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, actual);

        // Run sorted array through isSort method to confirm it's sorted
        assertTrue(SelectionSort.isSorted(SelectionSort.selectionSort(inputArr)));
    }

    @Test
    void singleArrayInputSelectionSortTest() {
        double[] inputArr = {23.45};

        double[] actual = SelectionSort.selectionSort(inputArr);
        double[] expected = {23.45};

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, actual);

        // Run sorted array through isSort method to confirm it's sorted
        assertTrue(SelectionSort.isSorted(SelectionSort.selectionSort(inputArr)));
    }

    @Test
    void selectionSortTest() {
        double[] inputArr = {8.4, 5.2 ,3 ,4 ,2.7 ,7 ,1 ,6};

        double[] actual = SelectionSort.selectionSort(inputArr);
        System.out.println(Arrays.toString(actual));

        double[] expected = {1, 2.7, 3, 4, 5.2, 6, 7, 8.4};

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, actual);

        // Run sorted array through isSort method to confirm it's sorted
        assertTrue(SelectionSort.isSorted(SelectionSort.selectionSort(inputArr)));
    }

    @Test
    void selectionSortNegativeNumberTest() {
        double[] inputArr = {34.2, 19, 42.7, -9.4, 2018, 0.5, 2005, 77, 2099.2};

        double[] actual = SelectionSort.selectionSort(inputArr);
        double[] expected = {-9.4, 0.5, 19, 34.2, 42.7, 77, 2005, 2018, 2099.2};

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, actual);

        // Run sorted array through isSort method to confirm it's sorted
        assertTrue(SelectionSort.isSorted(SelectionSort.selectionSort(inputArr)));
    }
}