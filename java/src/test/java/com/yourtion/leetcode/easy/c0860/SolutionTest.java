package com.yourtion.leetcode.easy.c0860;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().lemonadeChange(ss));
    }

    @Test
    void lemonadeChange() {
        runTest("[5,5,5,10,20]", true);
        runTest("[5,5,10]", true);
        runTest("[10,10]", false);
        runTest("[5,5,10,10,20]", false);
    }
}