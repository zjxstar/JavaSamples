package com.zjx.example;

import com.sun.source.util.Trees;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

    public void testTreeSet() {
        TreeSet<Integer> intSet = new TreeSet<>();
//        intSet.add(null); // 不允许null
        intSet.add(5);
        intSet.add(9);
        intSet.add(0);
        intSet.add(3);
        intSet.add(3); // 去重
        intSet.add(7);
        for (Integer integer : intSet) {
            System.out.println(integer);
        }

        System.out.println("--------------------自定义规则--------------------");
        TreeSet<String> strSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length(); // 比较长度，长度相同则重复
            }
        });
        strSet.add("hello");
        strSet.add("hi");
        strSet.add("aello"); // 和"hello"长度一样，重复了
        strSet.add("b");
        strSet.add("a"); // 和"b"重复了
        strSet.add("kotlin");
        for (String str : strSet) {
            System.out.println(str);
        }

        System.out.println("---------------------逆序输出---------------------");
        Iterator<String> iterator = strSet.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("--------------------导航方法-------------------");
        System.out.println("floor: " + intSet.floor(5)); // 小于等于5的第一个
        System.out.println("ceiling: " + intSet.ceiling(5)); // 大于等于5的第一个
        System.out.println("lower: " + intSet.lower(3)); // 小于3的第一个
        System.out.println("higher: " + intSet.higher(6)); // 大于6的第一个
        System.out.println("first: " + intSet.first());
        System.out.println("last: " + intSet.last());
        intSet.pollFirst(); // 弹出第一个
        for (Integer integer : intSet) {
            System.out.println(integer);
        }

        System.out.println("----------------------子Set-----------------------");
        SortedSet<Integer> subSet = intSet.headSet(8); // 最大值7，超过7越界
        for (Integer sub : subSet) {
            System.out.println(sub);
        }

        System.out.println("-------------------子Set可增可减，需要注意界限-------------------------");
        subSet.add(2);
//        subSet.add(8); // 越界了
        subSet.remove(3);
        for (Integer sub : subSet) {
            System.out.println(sub);
        }
    }

}
