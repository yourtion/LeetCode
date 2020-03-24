package com.yourtion.leetcode.easy.c0724;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().pivotIndex(ss));
    }

    @Test
    void pivotIndex() {
//        runTest("[1, 7, 3, 6, 5, 6]", 3);
//        runTest("[1, 2, 3]", -1);
        runTest("[-1,-1,-1,-1,-1,0]", 2);
    }
}