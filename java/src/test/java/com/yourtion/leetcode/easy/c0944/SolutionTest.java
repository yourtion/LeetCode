package com.yourtion.leetcode.easy.c0944;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {
    void runTest(String[] source, int res) {
        System.out.printf("runTest: %s , res: %d \n", Arrays.toString(source), res);
        Assertions.assertEquals(res, new Solution().minDeletionSize(source));
    }

    @Test
    void minDeletionSize() {
        runTest(new String[]{"cba", "daf", "ghi"}, 1);
        runTest(new String[]{"a", "b"}, 0);
        runTest(new String[]{"zyx", "wvu", "tsr"}, 3);
    }
}