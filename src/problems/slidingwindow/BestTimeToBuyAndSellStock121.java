package problems.slidingwindow;

public class BestTimeToBuyAndSellStock121 {
    public int maxProfit(int[] prices) {
        int low = 0;
        int high = low + 1 ;
        int max = 0;

        for (int i = high; i < prices.length; i++) {
            if (prices[i] < prices[low]) {
                low = i;
                continue;
            }
            max = Integer.max(max, prices[i] - prices[low]);
        }
        return max;
    }
}
