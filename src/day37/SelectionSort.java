package day37;

public class SelectionSort {
    // References:
    // https://www.geeksforgeeks.org/selection-sort/
    // https://stackoverflow.com/questions/34023517/selection-sort-for-doubles-in-java/34023603

    public static double[] selectionSort (double[] inputArray) {

        // Iterate through the array one by one
        for (int i = 0; i < inputArray.length - 1; i++) {

            // Find the minimum value in the unsorted array
            int min = i;
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[j] < inputArray[min]) { ;
                    min = j;
                }
            }

            // Create a temporary variable to store the minimum value
            // Swap the minimum value with the value at the index where the minimum value should be
            double temp = inputArray[min];
            inputArray[min] = inputArray[i];
            inputArray[i] = temp;
        }
        return inputArray;
    }

    public static boolean isSorted(double[] inputArray) {
        for (int i = 0; i < inputArray.length - 1; i ++) {
            if (inputArray[i + 1] < inputArray[i]) {
                return false;
            }
        }
        return true;
    }
}
