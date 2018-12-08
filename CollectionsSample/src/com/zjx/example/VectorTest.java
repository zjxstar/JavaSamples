package com.zjx.example;

import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.function.Consumer;

public class VectorTest {

    public void testVector() {
        Vector<Integer> vector = new Vector<>();
        vector.add(5);
        vector.add(1);
        vector.add(-4);
        vector.add(8);
        vector.add(22);
        vector.add(null); // 支持null
        Iterator<Integer> iterator = vector.iterator();
        while (iterator.hasNext()) {
//            iterator.remove();
            System.out.print(iterator.next() + " ");
        }

//        vector.add(99); // iterator不能执行add remove操作
//        vector.remove(5);
//        iterator.next();

        System.out.println();
        System.out.println("------------------排序后-------------------");
        vector.remove(null); // 去除null
        vector.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        Iterator<Integer> iterator2 = vector.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }

        System.out.println();
        System.out.println("-----------------使用Enumeration遍历--------------------");

        Enumeration<Integer> elements = vector.elements();
        while (elements.hasMoreElements()) {
            System.out.print(elements.nextElement() + " ");
        }
        vector.add(4); // 可以add
//        vector.remove(-4); // 不可用remove
        System.out.println(elements.nextElement());

        System.out.println();
        System.out.println("------------------------使用ForEach-------------------------");
        vector.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer + " ");
            }
        });

        System.out.println();
        System.out.println("---------------其他方法---------------");
        System.out.println("第一个：" + vector.firstElement());
        System.out.println("最后一个：" + vector.lastElement());
        System.out.println("8的下标：" + vector.indexOf(8));
        vector.add(7);
        vector.add(7);
        System.out.println("长度：" + vector.size());
        vector.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer + " ");
            }
        });

        System.out.println();
        System.out.println("------------------强制设置长度：4------------------");
        vector.setSize(4); // 多余的会被剪去
        vector.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer + " ");
            }
        });

        System.out.println();
        System.out.println("-------------------强制设置长度：12------------------");
        vector.setSize(12); // 不够的补null
        vector.forEach(integer -> {
            System.out.print(integer + " ");
        });

    }

}
