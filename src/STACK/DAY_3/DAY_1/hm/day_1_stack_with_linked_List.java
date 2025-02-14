package STACK.DAY_3.DAY_1.hm;


public class day_1_stack_with_linked_List {
    public static class Node{
        int value;
        Node next;
        Node(int value) {
        this.value = value;
        this.next=null;
        }
    }
    public static class My_Stack{
         static Node head;
        public static boolean my_isEmpty(){
            return head==null;
        }
        public static void my_push(int value){
            Node newNode = new Node(value);
            if(my_isEmpty()){
                head = newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int my_pop(){
            if(my_isEmpty()){
                return -1;
            }
            else{
                int temp=head.value;
                head=head.next;
                return temp;
            }

        }
        public int peek(){
            return head==null?-1:head.value;
        }
    }

    public static void main(String[] args) {
        My_Stack stack = new My_Stack();
        stack.my_push(5);
        stack.my_push(3);
        stack.my_push(2);
        System.out.println((stack.my_pop()));
        System.out.println((stack.peek()));
        while(!stack.my_isEmpty()){
            System.out.println(stack.peek());
        }
    }
}
