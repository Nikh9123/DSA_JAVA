package blind75;

import java.util.Stack;

public class reverseStack {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.empty()){
            return ;
        }

        int top = st.pop();

        reverseStack(st);
        insertAtBottom(st, top);
    }

    private static void insertAtBottom(Stack<Integer>stack, int top){

        if(stack.isEmpty()){
            stack.add(top);
            return ;
        }

        int peek = stack.pop();
        insertAtBottom(stack, top);
        stack.add(peek);
    }

    public static void main(String[] args) {
        
    }   
}
