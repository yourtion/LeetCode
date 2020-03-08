package com.yourtion.leetcode.easy.c0561;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().arrayPairSum(ss));
    }

    @Test
    void arrayPairSum() {
        runTest("[1,4,3,2]", 4);
        runTest("[]", 0);
    }
}