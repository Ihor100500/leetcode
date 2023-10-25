package main;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int firstValue = nums[i];
            int secondValue = target - firstValue;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == secondValue) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
