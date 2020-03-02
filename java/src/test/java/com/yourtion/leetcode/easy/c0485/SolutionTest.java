package com.yourtion.leetcode.easy.c0485;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().findMaxConsecutiveOnes(ss));
    }

    @Test
    void findMaxConsecutiveOnes() {
        runTest("[1,1,0,1,1,1]", 3);
        runTest("[1]", 1);
    }
}