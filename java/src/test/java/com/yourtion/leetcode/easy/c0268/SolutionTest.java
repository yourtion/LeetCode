package com.yourtion.leetcode.easy.c0268;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().missingNumber(ss));
    }

    @Test
    void missingNumber() {
        runTest("[3,0,1]", 2);
        runTest("[9,6,4,2,3,5,7,0,1]", 8);
        runTest("[0]", 1);
    }
}