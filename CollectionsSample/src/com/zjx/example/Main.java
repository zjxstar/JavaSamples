package com.zjx.example;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put(null, null);
        map.put(null, "hello world");
        System.out.println(map.get(null));
        System.out.println(Integer.toBinaryString(16-1));
        System.out.println(15 & hash("hello"));

    }

    public static final int hash(Object key) {
        int h;
        if (key == null) {
            return 0;
        } else {
            h = key.hashCode();
            System.out.println(h + " " + Integer.toBinaryString(h));
            int shift = h >>> 16;
            System.out.println(Integer.toBinaryString(shift));
            return h ^ shift;
        }
    }

}
