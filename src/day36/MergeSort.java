package day36;

public class MergeSort {
    // Switched directions after class review
    // https://www.geeksforgeeks.org/merge-sort/

    public static int[] sort(int[] inputArr, int left, int right){
        if (left < right) {
            int middle = (left + right) / 2;

            sort(inputArr, left, middle);
            sort(inputArr, middle + 1, right);

            merge(inputArr, left, middle, right);
        }
        return inputArr;
    }

    public static void merge(int inputArr[], int left, int middle, int right){
        // Find sizes of left and right arrays
        int leftSize = middle - left + 1;
        int rightSize = right - middle;

        // Create temp arrays
        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];

        // Copy data into respective temp arrays
        for (int i = 0; i < leftSize; i++) {
            leftArr[i] = inputArr[left + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArr[j] = inputArr[middle + 1 + j];
        }

        // Merge the temp arrays
        // Initial indexes for left, right, and input arrays
        int leftArrIndex = 0;
        int rightArrIndex = 0;
        int inputArrIndex = left;

        while (leftArrIndex < leftSize && rightArrIndex < rightSize) {
            if (leftArr[leftArrIndex] <= rightArr[rightArrIndex]) {
                inputArr[inputArrIndex] = leftArr[leftArrIndex];
                leftArrIndex++;
            } else {
                inputArr[inputArrIndex] = rightArr[rightArrIndex];
                rightArrIndex++;
            }
            inputArrIndex++;
        }

        // Put remaining elements of leftArr into inputArr if needed
        while (leftArrIndex < leftSize)
        {
            inputArr[inputArrIndex] = leftArr[leftArrIndex];
            leftArrIndex++;
            inputArrIndex++;
        }

        // Put remaining elements of rightArr into inputArr if needed
        while (rightArrIndex < rightSize)
        {
            inputArr[inputArrIndex] = rightArr[rightArrIndex];
            rightArrIndex++;
            inputArrIndex++;
        }
    }
}
