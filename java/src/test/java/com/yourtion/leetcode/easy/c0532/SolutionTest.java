package com.yourtion.leetcode.easy.c0532;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int k, int res) {
        System.out.printf("runTest: %s %d, res: %d \n", source, k, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().findPairs(ss, k));
    }

    @Test
    void findPairs() {
        runTest("[3, 1, 4, 1, 5]", 2, 2);
        runTest("[1, 2, 3, 4, 5]", 1, 4);
        runTest("[1, 3, 1, 5, 4]", 0, 1);
        runTest("[]", 0, 0);
    }
}