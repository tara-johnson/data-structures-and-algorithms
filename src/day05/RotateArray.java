package day05;

public class RotateArray {
    public static int[][] rotateArray(int[][] arr) {
        int[][] newArr = new int[arr.length][arr[0].length];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                newArr[col][arr.length - 1 - row] = arr[row][col];
            }
        }
        return newArr;
    }
}