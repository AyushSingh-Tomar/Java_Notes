package QUEUE;

public class DAY_3 {

    // You have to first check whether its empty or full;
    // if its not empty , dequeue
    // if its not full , enqueue

    static class Node{
        static int data;
        static Node next;
        static Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev=null;
        }
    }
    static class queue{
        static Node head;
        static Node rear;
        public static void enqueue(int data){
            Node newn = new Node(data);
            if(head==null){
                head=newn;
                rear=newn;
                newn.prev=null;
                return;
            }
            newn.next=head;
            head.prev=newn;
            head=newn;

        }
        public static int deque(){
            if(rear!=null){
                return -1;
            }
            else{
                int temp = rear.data;
                rear=rear.prev;
                return temp;
            }
        }
        public static boolean isEmpty(){
            return head==null;
        }
        public static String toStrings(){
            String s ="";
            while(rear!=null){
                s+=rear.data;
                rear=rear.prev;
            }
            return s;
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(5);
        q.enqueue(5);
        q.enqueue(5);
        System.out.println(q.toStrings());
    }
}
