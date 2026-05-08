package problems.d1dynamicprogramming;

import java.util.Arrays;

public class HouseRobberII213 {
    public int rob(int[] nums) {
        if (nums.length < 2) return nums[0];
        return Math.max(
                robHelp(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                robHelp(Arrays.copyOfRange(nums, 1, nums.length))
        );
    }

    private int robHelp(int[] nums) {
        int rob1 = 0, rob2 = 0;
        for (int num : nums) {
            int tmp = Math.max(num + rob1, rob2);
            rob1 = rob2;
            rob2 = tmp;
        }
        return rob2;
    }
}
