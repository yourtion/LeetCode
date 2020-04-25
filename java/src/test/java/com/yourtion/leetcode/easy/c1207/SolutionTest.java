package com.yourtion.leetcode.easy.c1207;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().uniqueOccurrences(ss));
    }

    @Test
    void uniqueOccurrences() {
        runTest("[1,2,2,1,1,3]", true);
        runTest("[1,2]", false);
        runTest("[-3,0,1,-3,1,1,1,-3,10,0]", true);
    }
}