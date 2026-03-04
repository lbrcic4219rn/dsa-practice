package problems.arraysandhashing;

import java.util.Arrays;

public class ProductsOfArrayExceptSelf238 {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);

        int curr = nums[0];
        for(int i = 1; i < nums.length; i++) {
            res[i] *= curr;
            curr *= nums[i];
        }

        curr = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--) {
            res[i] *= curr;
            curr *= nums[i];
        }

        return res;
    }
}
