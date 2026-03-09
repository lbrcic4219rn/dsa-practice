package problems.twopointers;

import java.util.*;

public class ThreeSum15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Map<Integer, List<Integer>> values = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            values.computeIfAbsent(nums[i], key -> new ArrayList<>()).add(i);
        }
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(!values.containsKey(-nums[i] - nums[j])) continue;

            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
