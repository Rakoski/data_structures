package algorithms.recursion.sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecursiveSum {
    public static int recusiveSum(List<Integer> num) {
        if (num.size() == 1) return num.getFirst();
        int first = num.getFirst();
        List<Integer> remaining = new ArrayList<>(num.subList(1, num.size()));
        return first + recusiveSum(remaining);
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(3);
        integers.add(6);
        System.out.println(recusiveSum(integers));
    }
}
