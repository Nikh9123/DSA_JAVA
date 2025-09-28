package blind75;

import java.util.Stack;

public class ValidPalindrome {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (!stack.empty() && (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}')) {
                if (stack.peek() == '(' && s.charAt(i) == ')') {
                    stack.pop();
                } else if (stack.peek() == '[' && s.charAt(i) == ']') {
                    stack.pop();
                } else if (stack.peek() == '{' && s.charAt(i) == '}') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.empty() == true) {
            return true;
        }
        return false;
    }

    public void main(String[] args) {
        String str = "(";

        System.out.println(isValid(str));
    }
}
