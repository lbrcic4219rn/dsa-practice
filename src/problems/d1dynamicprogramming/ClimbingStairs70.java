package problems.d1dynamicprogramming;

public class ClimbingStairs70 {
    public int climbStairs(int n) {
        if (n <= 2)
            return n ;
        int one = 1, two = 2;


        for(int i = 2; i < n; i++) {
            int sum = one + two;
            one = two;
            two = sum;
        }

        return two;
    }
}
