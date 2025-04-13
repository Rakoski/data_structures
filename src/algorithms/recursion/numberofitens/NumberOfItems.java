package algorithms.recursion.numberofitens;

import java.util.ArrayList;
import java.util.List;

public class NumberOfItems {
    public static int numberOfItems(List<Integer> items) {
        if (items.size() == 1) return 1;
        List<Integer> remaining = items.subList(1, items.size());
        return 1 + numberOfItems(remaining);
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(3);
        integers.add(6);
        integers.add(6);
        integers.add(8);
        System.out.println(numberOfItems(integers));
    }
}
