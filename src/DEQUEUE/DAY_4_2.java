package DEQUEUE;

import QUEUE.DAY_4;

import java.util.Arrays;

public class DAY_4_2 {
    static public class circular_queue {
        static int arr[];
        static int size = 0;
        static int front, rear = -1;

        circular_queue(int size) {
            this.size = size;
            this.front = -1;
            this.rear = -1;
            arr = new int[size];
        }

        public static void enqueue_front(int data) {
            if (front == 0 && rear == size - 1) {
                System.out.println("FUll!");
                return;
            }
            if (front == rear + 1) {
                System.out.println("FUll!");
                return;
            }
            if (front == rear && front == -1) {
                front = 0;
            }
            else if(front==0){
                front=size-1;
            }
            else{
                front--;
            }
            arr[front] = data;

        }
        public static void enqueue_rear(int data) {
            if (front == 0 && rear == size - 1) {
                System.out.println("FUll!");
                return;
            }
            if (front == rear + 1) {
                System.out.println("FUll!");
                return;
            }
            if (front == -1) {
                rear=0;
                front=0;
                arr[rear] = data;
            }
           else if(rear == size-1){
                rear=0;
            }
           else{
               rear++;
            }
            arr[rear] = data;

        }
        public static int dequeue() {
            int temp = -1;
            if (front == -1) {
                return temp;
            }
            temp = arr[front];
            arr[front] = 0;
            front = (front + 1) % size;
            return temp;
        }   public static int dequeue_rear() {
            int temp = -1;
            if (rear == -1) {
                return temp;
            }
            temp = arr[rear];
            arr[rear] = 0;
            rear = (rear-1) % size;
            return temp;
        }

        static void display() {
            System.out.println(Arrays.toString(arr));
        }

        public static void main(String[] args) {
            DAY_4_2.circular_queue q = new DAY_4_2.circular_queue(5);
//            enqueue(2);
//            enqueue(1);
//            enqueue(3);
//            enqueue(4);
//            display();
//            dequeue();
//            display();
//            dequeue();
//            dequeue();
//            display();
//            enqueue(5);
//            enqueue(6);
//            enqueue(7);
//            display();
//            enqueue_front(8);
//            display();
//            enqueue_front(9);
//            dequeue_rear();
//            display();
            enqueue_rear(1);
            display();
        }
    }
}
