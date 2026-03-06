package problems.stack;

import java.util.Stack;

public class ValidParentheses20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
                continue;
            }
            if (stack.empty()) {
                return false;
            }
            switch (s.charAt(i)) {
                case ')':
                    if(stack.peek() != '(') return false;
                    stack.pop();
                case ']':
                    if(stack.peek() != '[') return false;
                    stack.pop();
                case '}':
                    if(stack.peek() != '{') return false;
                    stack.pop();
            }
        }
        return stack.empty();
    }
}
