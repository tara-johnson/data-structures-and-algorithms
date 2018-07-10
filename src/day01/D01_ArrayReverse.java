package day01;

public class D01_ArrayReverse {
    public static void reverseArray(int[] arr) {
        for(int i = 0; i < arr.length / 2; i++) {
            int newArr = arr[i];
            arr[i] = arr[arr.length -i -1];
            arr[arr.length -i -1] = newArr;
        }
    }
}

