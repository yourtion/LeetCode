package com.yourtion.leetcode.easy.c1051;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().heightChecker(ss));
    }

    @Test
    void heightChecker() {
        runTest("[1,1,4,2,1,3]", 3);
        runTest("[5,1,2,3,4]", 5);
        runTest("[1,2,3,4,5]", 0);
    }
}