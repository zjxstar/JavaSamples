package com.zjx.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public void testHashMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, null); // key和value都可以为null
        map.put(null, "hello world");
        System.out.println("null -> " + map.get(null));

        map.put("A", "Hello");
        map.put("B", "World");
        map.put("C", "By");
        map.put("D", "Java");
        map.put("D", "Kotlin");
        System.out.println("------------------------for each------------------------");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

}
