package STACK.DAY_3;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String s ="Ayush";
        String ans ="";
        Stack<Character> stack = new Stack<Character>();
        char []a=s.toCharArray();
        for(char i :a){
            stack.push(i);
        }
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        System.out.println(ans);
    }
}
