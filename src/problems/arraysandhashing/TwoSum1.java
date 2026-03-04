package problems.arraysandhashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> sums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!sums.containsKey(target - nums[i])) {
                sums.put(nums[i], i);
            } else {
                res[0] = sums.get(target - nums[i]);
                res[1] = i;
                return res;
            }
        }
        return new int[2];
    }
}
