package com.zjx.example;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

    public void testPriorityQueue() {
        // 堆排序-小根堆
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(4);
        queue.add(8);
        queue.add(1);
        queue.add(-1);
//        queue.add(null); // 不支持null
        queue.add(0);
        print(queue);

        System.out.println("size: " + queue.size());
        System.out.println("poll: " + queue.poll());
        System.out.println("size: " + queue.size());
        print(queue);
        System.out.println("peek: " + queue.peek());

        queue.remove(0);
        print(queue);

        queue.offer(-7);
        print(queue);

        Queue<String> queue2 = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        queue2.offer("hello");
        queue2.offer("ha");
        queue2.offer("well");
        queue2.offer("like");
        queue2.offer("a");
        queue2.offer("python");
        print(queue2);
        System.out.println(queue2.peek());
    }

    private void print(Queue queue) {
        // 遍历的结果不是有序的
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

}
