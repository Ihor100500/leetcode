package main.leetcode.easy;

public class ClosestNumber {

  public static void main(String[] args) {
    ClosestNumber closestNumberObj = new ClosestNumber();
    int[] nums = {-4, -2, -1, 1, -4, 4, 8};
    System.out.println(closestNumberObj.findClosestNumber(nums));
  }

  public int findClosestNumber(int[] nums) {
    int closest = nums[0];

    for (int i : nums) {
      if (Math.abs(i) < Math.abs(closest)) {
        closest = i;
      }
    }

    if (closest < 0) {
      for (int i : nums) {
        if (i == Math.abs(closest)) {
          return Math.abs(closest);
        }
      }
    }
    return closest;
  }
}
