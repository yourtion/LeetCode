package com.yourtion.leetcode.easy.c0217;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().containsDuplicate(ss));
    }

    @Test
    void containsDuplicate() {
        runTest("[1,2,3,1]", true);
        runTest("[1,2,3,4]", false);
        runTest("[1,1,1,3,3,4,3,2,4,2]", true);
    }
}