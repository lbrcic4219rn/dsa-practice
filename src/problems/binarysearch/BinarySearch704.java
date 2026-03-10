package problems.binarysearch;

public class BinarySearch704 {
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length;

        while (low < high) {
            int guess = low + (high - low) / 2;
            if(nums[guess] == target) return guess;
            if(nums[guess] < target) low = guess + 1;
            else high = guess;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{3}, 3));
    }
}
