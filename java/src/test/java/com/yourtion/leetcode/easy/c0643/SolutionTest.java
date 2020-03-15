package com.yourtion.leetcode.easy.c0643;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int k, double res) {
        System.out.printf("runTest: %s %d , res: %f \n", source, k, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().findMaxAverage(ss, k));
    }

    @Test
    void findMaxAverage() {
        runTest("[1,12,-5,-6,50,3]", 4, 12.75);
        runTest("[1,12,-5,-6]", 4, 0.5);
        runTest("[0,4,0,3,2]", 1, 4);
        runTest("[7,4,5,8,8,3,9,8,7,6]", 7, 7.0);
    }
}