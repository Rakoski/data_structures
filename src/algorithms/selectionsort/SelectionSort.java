package algorithms.selectionsort;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {


    private static List<Integer> selectionSort(List<Integer> arr) {
        List<Integer> arrCopy = new ArrayList<>(arr);
        List<Integer> newArray = new ArrayList<>();

        while (!arrCopy.isEmpty()) {
            int menorIndice = buscaMenorIndice(arrCopy);
            newArray.add(arrCopy.get(menorIndice));
            arrCopy.remove(menorIndice);
        }
        return newArray;
    }

    private static int buscaMenorIndice(List<Integer> arr) {
        int menor = arr.getFirst();
        int menor_indice = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < menor) {
                menor = arr.get(i);
                menor_indice = i;
            }
        }
        return menor_indice;
    }

    public static void main(String[] args) {
        System.out.println(selectionSort(List.of(
                1, 2, 14, 20, 5, 11
        )));
    }
}
