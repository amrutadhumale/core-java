package com.company;

import java.util.*;

public class QueueInterfaceExamples {
    static void DequeExample(){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq);
    }

    static void PriorityQueueExamples(){
        //PriorityQueue<Integer> pq = new PriorityQueue<>(); //min priority
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());

    }
    static void  QueueExamples(){
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q);

    }
    public static void main(String[] args) {
       // PriorityQueueExamples();
      //  QueueExamples();
        DequeExample();

    }
}
