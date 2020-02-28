package com.yourtion.leetcode.easy.c0453;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().minMoves(ss));
    }

    @Test
    void minMoves() {
        runTest("[1,2,3]", 3);
        runTest("[1,2,3,4]", 6);
    }
}