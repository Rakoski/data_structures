package algorithms.mergesort;

public class MergeSort {
    // log base 2 of n (n is the length of the array)
    // O(n.log.n) time complexity (or log n . n)
    public int[] mergeSort(int[] array, int start, int end) {
        if (end - start + 1 <= 1) {
            return array; // base case for the single-indexes array parts
        }

        int middle = (start + end) / 2;
        mergeSort(array, start, middle);
        mergeSort(array, middle + 1, end);

        merge(array, start, middle, end);
        return array;
    }

    public static void merge(int[] array, int left, int middle, int right) {
        int length1 = middle - left + 1;
        int length2 = right - middle;

        int[] L = new int[length1];
        int[] R = new int[length2];

        for (int i = 0; i < length1; i++) {
            L[i] = array[left + i];
        }

        for (int j = 0; j < length2; j++) {
            R[j] = array[middle + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < length1 && j < length2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < length1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < length2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}