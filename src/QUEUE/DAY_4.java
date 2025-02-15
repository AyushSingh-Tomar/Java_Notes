package QUEUE;

import java.util.Arrays;

public class DAY_4 {
    static public  class circular_queue{
        static int arr[];
        static int size=0;
        static int front,rear=-1;
        circular_queue(int size){
            this.size=size;
            this.front =-1;
            this.rear =-1;
            arr= new int[size];
        }
        public static void enqueue(int data){
            if(front==0 && rear==size-1){
                System.out.println("FUll!");
                return;
            }
            if(front==rear+1){
                System.out.println("FUll!");
                return;
            }
            if(front==rear && front ==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;

        }
        public static int dequeue(){
            int temp=-1;
            if(front==-1){
                return temp;
            }
            temp = arr[front];
            arr[front]=0;
            front=(front+1)%size;
            return temp;
        }
         static void display(){
             System.out.println(Arrays.toString(arr));
         }

        public static void main(String[] args) {
            circular_queue q = new circular_queue(5);
            enqueue(2);
            enqueue(1);
            enqueue(3);
            enqueue(4);
            display();
            dequeue();
            display();
            dequeue();
            dequeue();
            display();
            enqueue(5);
            enqueue(6);
            enqueue(7);
            display();

        }
    }
    // Q1. what is the drawback of normal QUEUE which is overcome by the circular queue
    // ans=> Reusing Empty Space
    // it joins the last index to the first index of the queue

    // conditions for circular queue
    // Empty => front and rear ==-1
    // One element=> Front==Rear
    // Full => Front ==0 and Rear ==size-1
            //or
    // Full => Front == Rear+1;

    // New rear,Next index => Rear = (rear+1)%size
    // New Front ,Next Front => Front = (Front+1)%size
}
