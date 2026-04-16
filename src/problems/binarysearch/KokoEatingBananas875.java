package problems.binarysearch;

public class KokoEatingBananas875 {
    public int minEatingSpeed(int[] piles, int h) {
        int r = 0;
        for (int p : piles) {
            r = Math.max(r, p);
        }
        int l = 1;
        int res = r + 1;
        while (l <= r) {
            int k = l + (r - l) / 2; //eating rate
            int hoursLeft = h;
            for(int p : piles) {
                hoursLeft -= (p + k - 1) / k;
            }
            if (hoursLeft < 0) l = k + 1;
            else {
                res = Math.min(res, k);
                r = k - 1;
            }
        }
        return res;
    }

}
