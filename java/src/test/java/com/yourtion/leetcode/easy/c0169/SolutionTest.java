package com.yourtion.leetcode.easy.c0169;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().majorityElement(ss));
    }

    @Test
    void majorityElement() {
        runTest("[3,2,3]", 3);
        runTest("[2,2,1,1,1,2,2]", 2);
    }
}