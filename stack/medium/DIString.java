package stack.medium;

import java.util.Stack;

public class DIString {
    public String smallestNumber(String pattern) {
        Stack<Character> stack = new Stack<>();
        String ans = ""; // which will be pattern.length()+1
        int count = 1;
        for (int i = 0; i <= pattern.length(); i++) {
            stack.push((char) (count + '0'));
            count++;

            if (pattern.charAt(i) == 'I' || i == pattern.length()) {
                while (!stack.isEmpty()) {
                    ans += stack.peek();
                    stack.pop();
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
