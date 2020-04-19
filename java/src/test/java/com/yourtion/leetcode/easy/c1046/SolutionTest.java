package com.yourtion.leetcode.easy.c1046;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().lastStoneWeight(ss));
    }

    @Test
    void lastStoneWeight() {
        runTest("[2,7,4,1,8,1]", 1);
        runTest("[2,7,4,1,8,2]", 0);
    }
}