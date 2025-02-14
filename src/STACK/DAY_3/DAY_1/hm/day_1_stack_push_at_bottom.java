package STACK.DAY_3.DAY_1.hm;

import java.util.Stack;

public class day_1_stack_push_at_bottom {
    public static void pushBottom(int val,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(val);
            return;
        }
        int tp=s.pop();
        pushBottom(val,s);
        s.push(tp);
    }
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<Integer>();
//        ArrayList<Integer> list = new ArrayList<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        pushBottom(4,stack);
        System.out.println(stack);
//        System.out.println(stack);
//        while(!stack.isEmpty()){
//            list.add(stack.pop());
//        }
//        stack.push(4);
//        while(!list.isEmpty()){
//            stack.push(list.getLast());
//            list.removeLast();
//        }
//        System.out.println(stack);
    }
}
