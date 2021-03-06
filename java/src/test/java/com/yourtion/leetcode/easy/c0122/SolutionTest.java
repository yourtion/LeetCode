package com.yourtion.leetcode.easy.c0122;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().maxProfit(ss));
    }

    @Test
    void maxProfit() {
        runTest("[7,1,5,3,6,4]", 7);
        runTest("[1,2,3,4,5]", 4);
        runTest("[7,6,4,3,1]", 0);
        runTest("[2,4,1]", 2);
    }
}