package self.priorityQueue;

import java.util.PriorityQueue;

public class priority_queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<Integer>();
        p.add(0);
        p.add(1);
        p.add(0);
        p.remove(0);
        System.out.println(p.peek());

    }


}
