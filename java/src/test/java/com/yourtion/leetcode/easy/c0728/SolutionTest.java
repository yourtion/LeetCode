package com.yourtion.leetcode.easy.c0728;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {
    void runTest(int left, int right, String res) {
        System.out.printf("runTest: %d  %d, res: %s \n", left, right, res);
        List<Integer> ret = new Solution().selfDividingNumbers(left, right);
        Assertions.assertEquals(res, TestUtils.integerArrayListToString(ret));
    }

    @Test
    void selfDividingNumbers() {
        runTest(1, 22, "[1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]");
        runTest(9990, 10000, "[9999]");
    }
}