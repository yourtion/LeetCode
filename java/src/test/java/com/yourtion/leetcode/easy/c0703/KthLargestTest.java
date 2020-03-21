package com.yourtion.leetcode.easy.c0703;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KthLargestTest {

    @Test
    void KthLargest() {
        System.out.println("runTest: KthLargest");
        int k = 3;
        int[] arr = new int[]{4, 5, 8, 2};
        KthLargest kthLargest = new KthLargest(3, arr);
        Assertions.assertEquals(4, kthLargest.add(3));
        Assertions.assertEquals(5, kthLargest.add(5));
        Assertions.assertEquals(5, kthLargest.add(10));
        Assertions.assertEquals(8, kthLargest.add(9));
        Assertions.assertEquals(8, kthLargest.add(4));
    }

}