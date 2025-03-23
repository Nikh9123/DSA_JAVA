import java.util.HashMap;
import java.util.Stack;

public class InfixToPostFix {
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        String ans = Solution.infixToPostfix(s);
        System.out.println(ans);
        char c = 'z';
        System.out.println((int) c);
    }
}

class Solution {
    public static int getPresedence(Character ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '^') {
            return 3;
        }
        return -1;
    }

    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String s) {
        // Your code here
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Integer> presedenceMap = new HashMap<>();

        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                result.append(c);
            } else if (c == '(') {
                stack.push('(');
            } else if (c == ')') {
                while (stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            // If an operator is scanned
            else {
                while (!stack.isEmpty() && (getPresedence(c) < getPresedence(stack.peek()) || getPresedence(c) == getPresedence(stack.peek()))) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop all the remaining elements from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString() ;
    }
}
