package com.yourtion.leetcode.easy.c0605;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int n, boolean res) {
        System.out.printf("runTest: %s %d, res: %b \n", source, n, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().canPlaceFlowers(ss, n));
    }

    @Test
    void canPlaceFlowers() {
        runTest("[1,0,0,0,1]", 1, true);
        runTest("[1,0,0,0,1]", 2, false);
        runTest("[1,0,0,0,0]", 2, true);
        runTest("[1,0,0,0,0,1]", 2, false);
    }
}