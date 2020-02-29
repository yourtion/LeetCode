package com.yourtion.leetcode.easy.c0463;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().islandPerimeter(ss));
    }

    @Test
    void islandPerimeter() {
        runTest("[[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]", 16);
        runTest("[[0,0,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]", 14);
        runTest("[[0,1]]", 4);
    }
}