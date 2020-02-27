package com.yourtion.leetcode.easy.c0447;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[][] points = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().numberOfBoomerangs(points));
    }

    @Test
    void numberOfBoomerangs() {
        runTest("[[0,0],[1,0],[2,0]]", 2);
        runTest("[[0,0],[1,0],[2,0],[-1,0]]", 4);
    }
}