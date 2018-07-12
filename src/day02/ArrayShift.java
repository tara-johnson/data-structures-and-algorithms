package day02;

import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {
        int[] firstArr = {2, 4, 6, 8};
        int newVal = 5;
        insertShiftArray(firstArr, newVal);
    }

    public static void insertShiftArray(int[] firstArr, int newVal) {
        int length = firstArr.length;
//        int[] secondArr = new int[length + 1];

        int[] tempA = new int[(length + 1) / 2];
        int[] tempB = new int[length - tempA.length];

        for (int i = 0; i < length; i++) {
            if (i < tempA.length) {
                tempA[i] = firstArr[i];
            } else {
                tempB[i - tempA.length] = firstArr [i];
            }
        }

//        int[] secondArr = new int[tempA + tempB];
//        System.out.print(Arrays.toString(secondArr));

        System.out.println(Arrays.toString(tempA));
        System.out.println(newVal);
        System.out.println(Arrays.toString(tempB));
    }
}