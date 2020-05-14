package com.yourtion.leetcode.easy.c9014;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("面试题 03.01. 三合一")
class TripleInOneTest {

    @Test
    void testTripleInOne1() {
        System.out.println("runTest: testTripleInOne1");
        TripleInOne stack = new TripleInOne(1);
        stack.push(0, 1);
        stack.push(0, 2);
        Assertions.assertEquals(1, stack.pop(0));
        Assertions.assertEquals(-1, stack.pop(0));
        Assertions.assertEquals(-1, stack.pop(0));
        Assertions.assertTrue(stack.isEmpty(0));
    }

    @Test
    void testTripleInOne2() {
        System.out.println("runTest: testTripleInOne2");
        TripleInOne stack = new TripleInOne(2);
        stack.push(0, 1);
        stack.push(0, 2);
        stack.push(0, 3);
        Assertions.assertEquals(2, stack.pop(0));
        Assertions.assertEquals(1, stack.pop(0));
        Assertions.assertEquals(-1, stack.pop(0));
        Assertions.assertEquals(-1, stack.peek(0));
    }

    @Test
    void testTripleInOne3() {
        System.out.println("runTest: testTripleInOne3");
        TripleInOne stack = new TripleInOne(18);
        Assertions.assertEquals(-1, stack.peek(1));
        Assertions.assertEquals(-1, stack.pop(2));
        Assertions.assertTrue(stack.isEmpty(1));
        stack.push(2, 40);
        Assertions.assertEquals(40, stack.pop(2));
        stack.push(0, 44);
        stack.push(1, 40);
        Assertions.assertEquals(44, stack.pop(0));
        stack.push(1, 54);
        stack.push(0, 42);
        Assertions.assertFalse(stack.isEmpty(0));
        Assertions.assertEquals(54, stack.pop(1));
        Assertions.assertEquals(40, stack.peek(1));
        stack.push(0, 56);
        Assertions.assertEquals(-1, stack.peek(2));
        Assertions.assertFalse(stack.isEmpty(0));
        Assertions.assertEquals(-1, stack.peek(2));
        Assertions.assertEquals(-1, stack.pop(2));
        stack.push(1, 15);
        Assertions.assertFalse(stack.isEmpty(1));
        Assertions.assertEquals(15, stack.pop(1));
        Assertions.assertEquals(56, stack.peek(0));
        Assertions.assertEquals(-1, stack.peek(2));
        Assertions.assertEquals(56, stack.pop(0));
        Assertions.assertEquals(42, stack.peek(0));
        Assertions.assertFalse(stack.isEmpty(1));
        Assertions.assertEquals(42, stack.pop(0));
        stack.push(0, 32);
        Assertions.assertFalse(stack.isEmpty(0));
        Assertions.assertEquals(32, stack.peek(0));
        stack.push(0, 30);
        Assertions.assertEquals(-1, stack.peek(2));
        Assertions.assertFalse(stack.isEmpty(1));
        Assertions.assertFalse(stack.isEmpty(1));
        Assertions.assertFalse(stack.isEmpty(0));
        Assertions.assertFalse(stack.isEmpty(0));
        Assertions.assertEquals(30, stack.peek(0));
        stack.push(0, 56);
        stack.push(1, 40);
        Assertions.assertEquals(-1, stack.peek(2));
        Assertions.assertFalse(stack.isEmpty(0));
        Assertions.assertEquals(56, stack.peek(0));
        Assertions.assertFalse(stack.isEmpty(0));
        stack.push(2, 11);
        stack.push(0, 16);
        stack.push(0, 3);
        Assertions.assertEquals(11, stack.peek(2));
        Assertions.assertEquals(3, stack.peek(0));
        Assertions.assertEquals(11, stack.pop(2));
        stack.push(0, 39);
        stack.push(0, 63);
        Assertions.assertFalse(stack.isEmpty(1));
        Assertions.assertEquals(-1, stack.peek(2));
        Assertions.assertEquals(63, stack.pop(0));
        stack.push(2, 36);
        Assertions.assertEquals(40, stack.peek(1));
        Assertions.assertEquals(39, stack.peek(0));
        Assertions.assertEquals(36, stack.pop(2));
        Assertions.assertFalse(stack.isEmpty(1));
        Assertions.assertEquals(39, stack.pop(0));
        Assertions.assertEquals(40, stack.peek(1));
        Assertions.assertEquals(-1, stack.peek(2));
        stack.push(0, 8);
        stack.push(0, 38);
    }

}