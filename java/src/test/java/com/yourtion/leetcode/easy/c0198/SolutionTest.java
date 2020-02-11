package com.yourtion.leetcode.easy.c0198;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().rob(ss));
    }

    @Test
    void rob() {
        runTest("[1,2,3,1]", 4);
        runTest("[2,7,9,3,1]", 12);
        runTest("[2,1,1,2]", 4);
    }
}