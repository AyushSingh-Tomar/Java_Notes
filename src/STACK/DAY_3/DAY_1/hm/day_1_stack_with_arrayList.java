package STACK.DAY_3.DAY_1.hm;

import java.util.ArrayList;

public class day_1_stack_with_arrayList {
    static class  My_Stack{
        static ArrayList<Integer> lst=new ArrayList<Integer>();
        public static boolean my_isEmpty(){
            return lst.size()==0;
        }
        public static void push(int val){
            lst.add(val);
        }
        public static int pop(){
            if(my_isEmpty()){
                return -1;
            }
            int temp =lst.get(lst.size()-1);
            lst.remove(lst.size()-1);
            return temp;
        }
        public static int peek(){
            if(my_isEmpty()){
                return -1;
            }
            return lst.get(lst.size()-1);
        }
    }

    public static void main(String[] args) {
        My_Stack stack = new My_Stack();
        stack.push(5);
        stack.push(3);
        stack.push(2);
        System.out.println((stack.pop()));
        System.out.println((stack.peek()));
        while(!stack.my_isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
