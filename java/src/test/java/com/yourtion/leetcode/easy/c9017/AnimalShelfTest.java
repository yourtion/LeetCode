package com.yourtion.leetcode.easy.c9017;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("面试题 03.06. 动物收容所")
class AnimalShelfTest {

    @Test
    void testAnimalShelf() {
        System.out.println("runTest: AnimalShelf");
        AnimalShelf obj = new AnimalShelf();
        obj.enqueue(new int[]{0, 0});
        obj.enqueue(new int[]{1, 0});
        Assertions.assertArrayEquals(new int[]{0, 0}, obj.dequeueAny());
        Assertions.assertArrayEquals(new int[]{-1, -1}, obj.dequeueDog());
        Assertions.assertArrayEquals(new int[]{1, 0}, obj.dequeueCat());
    }
}