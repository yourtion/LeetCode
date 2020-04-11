package com.yourtion.leetcode.easy.c0961;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().repeatedNTimes(ss));
    }

    @Test
    void repeatedNTimes() {
        runTest("[1,2,3,3]", 3);
        runTest("[2,1,2,5,3,2]", 2);
        runTest("[5,1,5,2,5,3,5,4]", 5);
    }
}