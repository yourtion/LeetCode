package com.yourtion.leetcode.easy.c0717;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().isOneBitCharacter(ss));
    }

    @Test
    void isOneBitCharacter() {
        runTest("[1, 0, 0]", true);
        runTest("[1, 1, 1, 0]", false);
    }
}