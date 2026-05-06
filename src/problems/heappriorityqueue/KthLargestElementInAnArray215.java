package problems.heappriorityqueue;

public class KthLargestElementInAnArray215 {
    public int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        return quickSelect(nums, 0, nums.length - 1, k);
    }

    private int quickSelect(int[] nums, int left, int right, int k) {
        int pivot = nums[right];
        int p = left;

        for (int i = left; i < right; i++) {
            if (nums[i] < pivot) {
                int tmp = nums[p];
                nums[p] = nums[i];
                nums[i] = tmp;
                p++;
            }
        }

        int tmp = nums[p];
        nums[p] = nums[right];
        nums[right] = tmp;

        if (p > k) {
            return quickSelect(nums, left, p - 1, k);
        }
        if (p < k) {
            return quickSelect(nums, p + 1, right, k);
        }
        return nums[p];
    }

}
