package com.yourtion.leetcode.easy.c0496;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String s1, String s2, String res) {
        System.out.printf("runTest: %s  %s , res: %s \n", s1, s2, res);
        int[] s1s = TestUtils.stringToIntegerArray(s1);
        int[] s2s = TestUtils.stringToIntegerArray(s2);
        String ret = TestUtils.integerArrayToString(new Solution().nextGreaterElement(s1s, s2s));
        Assertions.assertEquals(res, ret);
    }

    @Test
    void nextGreaterElement() {
        runTest("[4,1,2]", "[1,3,4,2]", "[-1, 3, -1]");
        runTest("[2,4]", "[1,2,3,4]", "[3, -1]");
    }
}