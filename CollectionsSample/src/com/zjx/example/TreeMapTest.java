package com.zjx.example;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest {

    public void testTreeMap() {
        TreeMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(5, "5");
        sortedMap.put(1, "1");
        sortedMap.put(9, "9");
        sortedMap.put(0, "0");
        sortedMap.put(8, "8");
        sortedMap.put(11, null); // key不能为null，value可以为null
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("---------------------导航方法-----------------------");

        Map.Entry<Integer, String> lower = sortedMap.lowerEntry(6); // 小于6的第一个
        Map.Entry<Integer, String> higher = sortedMap.higherEntry(5); // 大于5的第一个
        Map.Entry<Integer, String> floor = sortedMap.floorEntry(3); // 小于等于3的第一个
        Map.Entry<Integer, String> ceiling = sortedMap.ceilingEntry(2); // 大于等于2的第一个
        System.out.println(lower != null ? lower.getKey() + " -> " + lower.getValue() : "no lower entry");
        System.out.println(higher != null ? higher.getKey() + " -> " + higher.getValue() : "no higher entry");
        System.out.println(floor != null ? floor.getKey() + " -> " + floor.getValue() : "no floor entry");
        System.out.println(ceiling != null ? ceiling.getKey() + " -> " + ceiling.getValue() : "no ceiling entry");

        System.out.println("---------------------子Map-----------------------");

        SortedMap<Integer, String> subSortedMap1 = sortedMap.subMap(1, 8);
        SortedMap<Integer, String> subSortedMap2 = sortedMap.subMap(1, false, 8, true);

        System.out.println("---------------------sub map 1-----------------------");

        for (Map.Entry<Integer, String> entry : subSortedMap1.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("---------------------sub map 2-----------------------");

        for (Map.Entry<Integer, String> entry : subSortedMap2.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("---------------------构造TreeMap-----------------------");
        TreeMap<Integer, String> sortedMap2 = new TreeMap<>();
        sortedMap2.put(5, "5");
        sortedMap2.put(1, "1");
        sortedMap2.put(9, "9");
        sortedMap2.put(0, "0");
        sortedMap2.put(8, "8");
        TreeMap<Integer, String> sortedMap2new = new TreeMap<>(sortedMap2);
        // 反向TreeMap
        NavigableMap<Integer, String> deMap = sortedMap2new.descendingMap();
        for (Map.Entry<Integer, String> entry : deMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

}
