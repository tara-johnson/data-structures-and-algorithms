package day05;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    @Test
    void emptyArrayTest() {
        int[][] arr = {
                {},
                {},
                {}
        };
        String result = Arrays.deepToString(RotateArray.rotateArray(arr));

        String expected = Arrays.deepToString(new int[][] {
                {},
                {},
                {}
        });
        assertEquals(expected, result);
    }

    @Test
    void rotateArrayTest() {
        int[][] arr = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        };
        String result = Arrays.deepToString(RotateArray.rotateArray(arr));

        String expected = Arrays.deepToString(new int[][] {
                {3, 2, 1},
                {3, 2, 1},
                {3, 2, 1}
        });
        assertEquals(expected, result);
    }

    @Test
    void array6x6Test() {
        int[][] arr = {
                {1, 1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3, 3},
                {1, 1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3, 3}
        };
        String result = Arrays.deepToString(RotateArray.rotateArray(arr));

        String expected = Arrays.deepToString(new int[][] {
                {3, 2, 1, 3, 2, 1},
                {3, 2, 1, 3, 2, 1},
                {3, 2, 1, 3, 2, 1},
                {3, 2, 1, 3, 2, 1},
                {3, 2, 1, 3, 2, 1},
                {3, 2, 1, 3, 2, 1}
        });
        assertEquals(expected, result);
    }
}