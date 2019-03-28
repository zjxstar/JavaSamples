package com.zjx.example;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public void testHashSet() {
        HashSet<String> sets = new HashSet<>();
        sets.add(null); // 支持null
        sets.add("A"); // 不重复
        sets.add("A");
        sets.add("B");
        sets.add("C");
        sets.add("D");

        Iterator<String> iterator = sets.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("-------------------去除元素------------------");
        sets.remove(null);
        Iterator<String> iterator2 = sets.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        System.out.println("---------Set没有get方法，可以转成Object数组，再对单个元素进行强转-----------");
//        System.out.println(sets.get(0)); // Set没有get方法

        Object[] setsObjs = sets.toArray();
        for (Object obj : setsObjs) {
            System.out.println((String) obj);
        }

        // 拿到的不一定是add的第二个
        System.out.println("第二个元素：" + (String) setsObjs[1]);

        System.out.println("---------Set支持foreach-----------");
        for (String str : sets) {
            System.out.println(str);
        }

    }

}
