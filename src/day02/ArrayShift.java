package day02;

public class ArrayShift {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int newVal = 5;
        insertShiftArray(arr, newVal);
    }

    public static int[] insertShiftArray(int[] arr, int newVal) {
        int[] secondArr = new int[arr.length + 1];
        int firstArrayMidIndex = arr.length / 2;
        int secondArrayMidIndex = (arr.length + 1) / 2;

        // Original array has zero elements
        // Add new value to first index in array
        // Return the new array
        if (arr.length == 0) {
            secondArr[0] = newVal;
            return secondArr;
        }

        // Original array has at least one element
        // The first half of the elements (or the only element) from the first array are put into a second array
        for (int i = 0; i <= firstArrayMidIndex; i++) {
            secondArr[i] = arr[i];
        }

        // newVal is inserted into the second array at it's middle index
        secondArr[secondArrayMidIndex] = newVal;

        // Starting at the middle index, insert the second half of the values from the first array into the second array
        //  If the original array has only one element
        if (arr.length == 1) {
            for (int i = firstArrayMidIndex + 1; i < arr.length; i++) {
                secondArr[i + 1] = arr[i];
            }
        }

        if (arr.length > 1) {
            // If an even number of elements in the original array
            // Insert the second half of the array values starting at the middle index
            if (firstArrayMidIndex % 2 == 0) {
                for (int i = firstArrayMidIndex; i < arr.length; i++) {
                    secondArr[i + 1] = arr[i];
                }
            } else {
                // If an odd number of elements in the original array
                // Insert the second half of the array values starting at the middle index + 1
                for (int i = firstArrayMidIndex + 1; i < arr.length; i++) {
                    secondArr[i + 1] = arr[i];
                }
            }
        }
        return secondArr;
    }
}