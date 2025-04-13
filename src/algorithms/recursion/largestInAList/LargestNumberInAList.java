package algorithms.recursion.largestInAList;

import java.util.ArrayList;
import java.util.List;

public class LargestNumberInAList {
    public static int largestInAList(List<Integer> nums) {
        if (nums.size() == 1) return nums.getFirst();

        int first = nums.getFirst();
        List<Integer> remaining = nums.subList(1, nums.size());
        int largest = largestInAList(remaining);

        if (largest > first) {
            return largest;
        } else {
            return first;
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(20);
        integers.add(23);
        integers.add(15);
        integers.add(87);
        integers.add(18);
        System.out.println(largestInAList(integers));
    }
}
