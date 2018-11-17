package com.zjx.example;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

    public void testArrayList() {
        ArrayList<String> strs = new ArrayList<>();
        strs.add("A");
        strs.add("B");
        strs.add("C");
        strs.add("D");
        strs.add("E");
        strs.add(null); // 支持null
        for (String str : strs) {
            System.out.println(str);
        }

        System.out.println("List长度：" + strs.size());

        System.out.println("List的第三个元素：" + strs.get(2));

        String nullStr = strs.remove(5);
        System.out.println("删除null：" + nullStr);

        System.out.println("---------------------排序-------------------");
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(8);
        intList.add(4);
        intList.add(0);
        intList.add(33);
        intList.add(2);
        Collections.sort(intList);
        for (Integer num : intList) {
            System.out.println(num);
        }
    }

}
