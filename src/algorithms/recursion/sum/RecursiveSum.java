package algorithms.recursion.sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecursiveSum {
    public static int recusiveSum(List<Integer> nums) {
        if (nums.size() == 1) return nums.getFirst();
        int first = nums.getFirst();
        List<Integer> remaining = nums.subList(1, nums.size());
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
