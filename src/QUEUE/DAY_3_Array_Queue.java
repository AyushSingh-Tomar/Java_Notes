package QUEUE;

public class DAY_3_Array_Queue {
    class queue{
        static int arr[];
        static int front,rear;
        static int size;
        queue(int data){
           this.front=-1;
           this.rear=-1;
           this.size=data;
           arr= new int[size];
        }
        public static void enqueue(int data){
            if(front==size-1){
                System.out.println("Queue is full");

            }
            else{
                if(front==-1){
                    front=0;
                }
                rear++;
                arr[rear]=data;
            }
        }
        public static int dequeue(){
            if()
        }
    }
    public static void main(String[] args) {

    }
}
