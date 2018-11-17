package com.zjx.example;

import java.util.LinkedList;

public class LinkedListTest {

    public void testLinkedList() {
        LinkedList<String> strs = new LinkedList<>();
        strs.add("B");
        strs.add("E");
        strs.add("C");
        strs.add("A");
        strs.add("Y");
        strs.add("E");
        for (String str : strs) {
            System.out.println(str);
        }

        System.out.println("第一个元素：" + strs.getFirst());
        System.out.println("最后一个元素：" + strs.getLast());

        System.out.println("--------------新链表--------------");

        strs.addFirst("链表头插入Head");
        strs.addLast("链表尾插入Tail");
        for (String str : strs) {
            System.out.println(str);
        }

        System.out.println("--------------其他操作---------------");
        System.out.println("peek操作：" + strs.peek());
        System.out.println("offer操作：" + strs.offer("Offer"));
        System.out.println("poll操作：" + strs.poll());
        System.out.println("pop操作：" + strs.pop());
        strs.push("Push");
        System.out.println("-------------操作后的链表-------------");
        for (String str : strs) {
            System.out.println(str);
        }
    }

}
