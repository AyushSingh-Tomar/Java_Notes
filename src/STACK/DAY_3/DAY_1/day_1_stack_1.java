package STACK.DAY_3.DAY_1;

import java.util.Scanner;
import java.util.Stack;

public class day_1_stack_1 {
    public static void main(String[] args) {
        boolean ans=false;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> stack = new Stack<Character>();
        char[] ch = s.toCharArray();
        for(char i :ch){
            if(i=='{'){
                stack.push('}');
            }
            else if(i=='('){
                stack.push(')');
            }
            else if(i=='['){
                stack.push(']');
            }
            else if(stack.isEmpty()|| i!=stack.pop()) {

                    System.out.println("No");
                    ans=true;
                    break;

            }
        }
        if(!ans) {
            if (stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
