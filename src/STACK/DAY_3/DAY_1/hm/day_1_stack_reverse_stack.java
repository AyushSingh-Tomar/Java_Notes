package STACK.DAY_3.DAY_1.hm;

import java.util.ArrayList;
import java.util.Stack;

public class day_1_stack_reverse_stack {
    public static void pushBottom(int val,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(val);
            return;
        }
        int tp=s.pop();
        pushBottom(val,s);
        s.push(tp);
    }
    public static void reverseStack(Stack<Integer> s) {

      if(s.isEmpty()){
          return;
      }
      int tp=s.pop();
      reverseStack(s);
      pushBottom(tp,s);

    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> lst = new ArrayList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);
    }
}
