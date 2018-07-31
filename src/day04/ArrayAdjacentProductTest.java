package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayAdjacentProductTest {

    @Test
    void emptyArrayTest() {
        int[][] aa = {};
        int result = ArrayAdjacentProduct.largestProduct(aa);

        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    void largestProductTest() {
        int[][] aa = {
                {1, 2, 1},
                {2, 4, 2},
                {3, 6, 8},
                {7, 8, 1}
        };
        int result = ArrayAdjacentProduct.largestProduct(aa);

        int expected = 64;
        assertEquals(expected, result);
    }

    @Test
    void lotsOfArraysTest() {
        int[][] aa = {
                {1, 2, 1, 2, 1, 2, 1, 2, 1, 2},
                {2, 4, 2, 4, 2, 4, 2, 4, 2, 4},
                {3, 6, 8, 3, 6, 8, 3, 6, 8, 3},
                {7, 8, 1, 7, 8, 1, 7, 8, 1, 7},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {2, 4, 6, 8, 10, 12, 14, 16, 18, 20},
                {5, 10, 15, 20, 25, 30, 35, 40, 45, 50},
                {10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
                {9, 14, 7, 30, 32, 12, 21, 19, 69, 42},
                {96, 33, 8, 12, 9, 4, 41, 36, 10, 27}
        };
        int result = ArrayAdjacentProduct.largestProduct(aa);

        int expected = 3168;
        assertEquals(expected, result);
    }
}