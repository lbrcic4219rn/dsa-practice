package problems.stack;

import java.util.Stack;

public class LargestRectangleInHistogram84 {
    public static int largestRectangleArea(int[] heights) {
        int max = 0;
        Stack<int[]> stack = new Stack<>();

        for(int i = 0; i < heights.length; i++) {
            if(stack.empty() || stack.peek()[0] < heights[i]) {
                stack.push(new int[]{heights[i], i});
                continue;
            }
            if(stack.peek()[0] == heights[i]) {
                stack.push(stack.peek());
                continue;
            }
            int[] el = new int[2];
            while(!stack.empty() && stack.peek()[0] > heights[i]) {
                el = stack.pop();
                max = Math.max(max, el[0] * (i - el[1]));
            }
            stack.push(new int[]{heights[i], el[1]});
        }
        while(!stack.empty()) {
            int[] el = stack.pop();
            max = Math.max(max, el[0] * (heights.length - el[1]));
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{3,6,5,7,4,8,1,0}));
    }
}
