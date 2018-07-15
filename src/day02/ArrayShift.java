package day02;

public class ArrayShift {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int newVal = 5;
        insertShiftArray(arr, newVal);
    }

    public static int[] insertShiftArray(int[] arr, int newVal) {
        int[] secondArr = new int[arr.length + 1];
        int midIndex = arr.length / 2;

        for (int i = 0; i <= midIndex; i++) {
            secondArr[i] = arr[i];
        }
        secondArr[(arr.length + 1) / 2] = newVal;
        for (int i = midIndex + 1; i < arr.length; i++) {
            secondArr[i+1] = arr[i];
        }

        return secondArr;
    }
}