package code;

import java.util.*;

class priorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(1);

        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}