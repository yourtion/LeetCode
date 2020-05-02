package com.yourtion.leetcode.easy.c0303;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumArrayTest {
    int[] a = TestUtils.stringToIntegerArray("[-2, 0, 3, -5, 2, -1]");
    NumArray arr = new NumArray(a);

    void runTest(int i, int j, int res) {
        System.out.printf("runTest: %d %d, res: %s ", i, j, res);
        assertEquals(res, arr.sumRange(i, j));
    }

    @Test
    void sumRange() {
        runTest(0, 2, 1);
        runTest(2, 5, -1);
        runTest(0, 5, -3);
    }
}