package com.yourtion.leetcode.easy.c1010;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().numPairsDivisibleBy60(ss));
    }

    @Test
    void numPairsDivisibleBy60() {
        runTest("[30,20,150,100,40]", 3);
        runTest("[60,60,60]", 3);
        runTest("[30,20,150,100,40,30]", 5);
        runTest("[15,63,451,213,37,209,343,319]", 1);
    }
}