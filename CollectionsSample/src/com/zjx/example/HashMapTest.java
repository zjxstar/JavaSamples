package com.zjx.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public void testHashMap() {
        Map<String, String> map = new HashMap<>();
        map.put(null, null); // key和value都可以为null
        map.put(null, "hello world");
        System.out.println(map.get(null));
    }

}
