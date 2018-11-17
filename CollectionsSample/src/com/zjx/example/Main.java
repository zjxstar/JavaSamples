package com.zjx.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------------------HashMap示例----------------------");
        HashMapTest hashMapTest = new HashMapTest();
        hashMapTest.testHashMap();

        System.out.println("---------------------TreeMap示例----------------------");
        TreeMapTest treeMapTest = new TreeMapTest();
        treeMapTest.testTreeMap();

        System.out.println("---------------------HashSet示例----------------------");
        HashSetTest hashSetTest = new HashSetTest();
        hashSetTest.testHashSet();
    }

}
