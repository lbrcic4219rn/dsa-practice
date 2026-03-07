package problems.stack;

import java.util.Stack;

public class MinStack155 {
    private final Stack<Integer> data;
    private final Stack<Integer> min;

    public MinStack155() {
        data = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        data.push(val);
        if(min.empty() || min.peek() > val) {
            min.push(val);
            return;
        }
        min.push(min.peek());
    }

    public void pop() {
        data.pop();
        min.pop();
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
