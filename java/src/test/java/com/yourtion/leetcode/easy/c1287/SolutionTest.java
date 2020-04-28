package com.yourtion.leetcode.easy.c1287;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().findSpecialInteger(ss));
    }

    @Test
    void findSpecialInteger() {
        runTest("[1,2,2,6,6,6,6,7,10]", 6);
        runTest("[1,2,2,2,4,5,6,9]", 2);
    }
}