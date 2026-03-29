package problems.arraysandhashing;

public class MaxConsecutiveOnes485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 0) {
                max = Math.max(max, count);
                count = 0;
                continue;
            }
            count++;
        }

        return Math.max(max, count);
    }
}
