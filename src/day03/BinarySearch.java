package day03;

public class BinarySearch {

    public static int BinarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            if (arr[middle] < key) {
                low = middle + 1;
            } else if (arr[middle] > key) {
                high = middle -1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}