package com.zjx.example;

import java.util.Stack;

public class StackTest {

    public void testStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(2);
        stack.push(11);
        stack.push(-6);
        stack.push(5);
        stack.push(null); // 支持null
        stack.forEach(integer -> {
            System.out.print(integer + " ");
        });

        System.out.println();
        System.out.println("pop操作：" + stack.pop());
        System.out.println("peek操作：" + stack.peek());
        System.out.println("push操作：" + stack.push(8));

        stack.add(66);
        System.out.println("使用add操作：" + stack.peek());

        System.out.println();
        System.out.println("stack是否空：" + stack.empty());

        System.out.println();
        stack.forEach(integer -> {
            System.out.print(integer + " ");
        });
        System.out.println();
        // 基本位置为1
        System.out.println("search操作，11距离顶部的距离：" + stack.search(11));
        System.out.println("search 7：" + stack.search(7));
        System.out.println("search 66：" + stack.search(66));
        stack.push(0);
        stack.push(0);
        stack.push(0);
        stack.push(9);
        stack.push(33);
        stack.forEach(integer -> {
            System.out.print(integer + " ");
        });
        System.out.println();
        System.out.println("search 离顶部最近的0：" + stack.search(0));
    }

}
