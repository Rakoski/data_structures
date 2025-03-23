package structures.staticarrays.problems;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int countNormal = 0;
        int lastElement = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == lastElement) {
                nums[i] = 1000;
            } else {
               lastElement = nums[i];
               countNormal++;
            }
        }

//        int[] temp = Arrays.copyOf(nums, nums.length);
//        int index = 0;
//
//        for (int num : temp) {
//            if (num != 1000) {
//                nums[index++] = num;
//            }
//        }

        System.out.println(Arrays.toString(nums));
        return ++countNormal;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2, 2, 3, 3, 3, 4}));
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
    }
}
