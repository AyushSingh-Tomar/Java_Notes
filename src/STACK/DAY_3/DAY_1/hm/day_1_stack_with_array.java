package STACK.DAY_3.DAY_1.hm;

public class day_1_stack_with_array {
    public static class Stack{
        static int top=-1;
        static int size=0;
        static int[] array;
        Stack(int size){
            array= new int[size];
            this.size=size;
        }
        public static boolean isEmpty(){
            return top==-1;
        }
        public static void push(int val){
            if(top==size-1){
                System.out.println("Stack is full");
            }
            else{
                array[++top]=val;
            }
        }
        public static int pop(){
            int temp = array[top];
            top--;
            return temp;
        }
        public static int peek(){
            if(top==-1){
                return -1;
            }
            return array[top];
        }

        public static void display(){
            for(int i=0; i<=top; i++){
                System.out.print(array[i]+"\t");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
//        stack.display();
        stack.pop();
        stack.display();
        System.out.println((stack.peek()));
    }
}
