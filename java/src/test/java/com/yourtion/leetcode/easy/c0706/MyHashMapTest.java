package com.yourtion.leetcode.easy.c0706;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyHashMapTest {
    @Test
    void runTest() {
        System.out.println("MyHashMapTest");

        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        Assertions.assertEquals(1, hashMap.get(1));
        Assertions.assertEquals(-1, hashMap.get(3));
        hashMap.put(2, 1);
        Assertions.assertEquals(1, hashMap.get(2));
        hashMap.remove(2);
        Assertions.assertEquals(-1, hashMap.get(2));
    }

}