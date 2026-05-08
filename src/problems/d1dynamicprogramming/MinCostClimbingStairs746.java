package problems.d1dynamicprogramming;

public class MinCostClimbingStairs746 {
    public int minCostClimbingStairs(int[] cost) {
        int first = cost[0];
        int second = cost[1];

        for (int i = 2; i < cost.length; i++) {
            int min = cost[i] + Math.min(first, second);
            first = second;
            second = min;
        }

        return Math.min(first, second);
    }
}
