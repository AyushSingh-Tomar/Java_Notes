package STACK.DAY_3;

import java.util.HashMap;
import java.util.Stack;

public class day_1_1 {
    public static String cov(String pf) {
        char[] ch = pf.toCharArray();
        Stack<String> stack = new Stack<String>();
        for(char c:ch){
            if(Character.isLetter(c)){
              stack.push(c+"");
            }
            else{
                String op1 = stack.pop();
                String op2 = stack.pop();
                String ns = "("+op2+c+op1+")";
                stack.push(ns);
            }
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        String pf = "ABCD*/-";
        System.out.println(cov(pf));
        HashMap<Character, Integer> priority = new HashMap<Character, Integer>();
        priority.put('^',3);
        priority.put('*',2);
        priority.put('/',2);
        priority.put('+',1);
        priority.put('-',1);
        priority.put('(',0);
        priority.put(')',0);
        /* Rules ->
        1> set priority
            ^   -> high priority
            *,/ -> medium priority
            +,- -> low priority
        2> you can't put two operators of same priority can be in stack simultaneously
        3> If any operator inside the bracket should be popped out of the stack
        4> we need to pop any operator which comes between ( and)
        5> lower priority operator in front of higher priority operator can not be tolerated
        6> Higher priority operator in front of lower priority operator can stay together
        see some paper pen solution
        */
// ABC/DE+*+F-
        Stack<Character> stack = new Stack<Character>();
        String s = pf;
        String ans="";
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length;i++){
            if(Character.isLetter(ch[i])){
                ans+=ch[i];
            }
            else{

                if(stack.isEmpty()){
                    stack.push(ch[i]);
                }
                else {
                    int pt=priority.get((stack.peek()));
                    int pn=priority.get(ch[i]);
                    if(ch[i]=='('){
                        stack.push(ch[i]);
                    }
                    else if(ch[i]==')')
                    {

                        while(!stack.isEmpty() && stack.peek()!='('){
                            ans+=stack.pop();
                        }
                        if(!stack.isEmpty()) stack.pop();

                    }
                    else{ while(!stack.isEmpty() && pt>pn && stack.peek()!='(' ) {
                        ans += stack.pop();

                    }
                        stack.push(ch[i]);
                    }
                }
            }
        }
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        System.out.println(ans);
        // HW all types of infix postfix prefix
    }
    }


