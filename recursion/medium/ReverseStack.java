import java.util.Iterator;
import java.util.Stack;

public class ReverseStack {

    // static void reverse(Stack<Integer> s)
    // {
    //     if(s.isEmpty()){
    //         return ;
    //     }

    //     int ele = s.pop() ;
    //     reverse(s);
    //     insertAtBottom(s, ele);
    // }

    // static void insertAtBottom(Stack<Integer> s, int ele) {
    //     if(s.isEmpty()){
    //         s.push(ele) ;
    //         return ;
    //     }

    //     int top = s.pop() ;
    //     insertAtBottom(s, ele);
    //     s.push(top);
    // }

    static void reverse(Stack<Integer>s){
        if(s.empty()){
            return ;
        }

        int top = s.pop() ;
        reverse(s);

        Stack<Integer>temp = new Stack<>() ;

        while (!s.empty()) {
            temp.push(s.pop()) ;
        }
        s.push(top);

        while(!temp.empty()){
            s.push(temp.pop()) ;
        }
    }

    public static void main(String[] args) {
        Stack<Integer>stack1 = new Stack<>() ;
        
        for(int i = 0; i < 6 ; i++){
            stack1.push(i) ;
        }

        reverse(stack1);

        // print stack without popping the value using iterator
        Iterator<Integer> iterator = stack1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
