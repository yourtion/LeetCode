package com.yourtion.leetcode.easy.c0189;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int k, String res) {
        System.out.printf("runTest: %s %d, res: %s \n", source, k, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        new Solution().rotate(ss, k);
        String ret = TestUtils.integerArrayToString(ss);
        Assertions.assertEquals(res, ret);
    }

    @Test
    void rotate() {
        runTest("[1,2,3,4,5,6,7] ", 3, "[5, 6, 7, 1, 2, 3, 4]");
        runTest("[-1,-100,3,99]", 2, "[3, 99, -1, -100]");
    }
}