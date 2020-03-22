package com.yourtion.leetcode.easy.c0705;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyHashSetTest {

    @Test
    void runTest() {
        System.out.println("MyHashSetTest");

        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        Assertions.assertTrue(hashSet.contains(1), "返回 true");
        Assertions.assertFalse(hashSet.contains(3), "返回 false (未找到)");
        hashSet.add(2);
        Assertions.assertTrue(hashSet.contains(2), "返回 true 2");
        hashSet.remove(2);
        Assertions.assertFalse(hashSet.contains(2), "返回  false (已经被删除)");
    }

}