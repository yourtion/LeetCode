package com.yourtion.leetcode.easy.c0575;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().distributeCandies(ss));
    }

    @Test
    void distributeCandies() {
        runTest("[1,1,2,2,3,3]", 3);
        runTest("[1,1,2,3]", 2);
        runTest("[-100000,100000,-100000,100000,1,2]", 3);
    }
}