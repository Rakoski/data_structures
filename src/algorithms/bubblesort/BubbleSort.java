package algorithms.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[j - 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = temp;
                }
            }
        }
        return vetor;
    }

    public static void main(String[] args) {
        // [1, 2, 3, 4, 5] -> o(n)
        System.out.println(Arrays.toString(bubbleSort(new int[]{8, 3, 1, 10, 9})));
    }
}
