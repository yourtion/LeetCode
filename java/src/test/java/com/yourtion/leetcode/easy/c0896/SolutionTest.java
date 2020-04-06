package com.yourtion.leetcode.easy.c0896;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().isMonotonic(ss));
    }

    @Test
    void isMonotonic() {
        runTest("[1,2,2,3]", true);
        runTest("[6,5,4,4]", true);
        runTest("[1,3,2]", false);
        runTest("[1,2,4,5]", true);
        runTest("[1,1,1]", true);
    }
}