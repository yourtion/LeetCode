package com.yourtion.leetcode.easy.c0594;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().findLHS(ss));
    }

    @Test
    void findLHS() {
        runTest("[1,3,2,2,5,2,3,7]", 5);
        runTest("[1,3,3,5,5,7,7,7]", 0);
        runTest("[]", 0);
    }
}