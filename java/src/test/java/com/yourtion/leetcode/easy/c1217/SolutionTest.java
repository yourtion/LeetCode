package com.yourtion.leetcode.easy.c1217;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().minCostToMoveChips(ss));
    }

    @Test
    void minCostToMoveChips() {
        runTest("[1,2,3]", 1);
        runTest("[2,2,2,3,3]", 2);
    }
}