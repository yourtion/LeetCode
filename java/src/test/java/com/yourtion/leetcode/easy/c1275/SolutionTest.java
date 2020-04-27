package com.yourtion.leetcode.easy.c1275;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().tictactoe(ss));
    }

    @Test
    void tictactoe() {
        runTest("[[0,0],[2,0],[1,1],[2,1],[2,2]]", "A");
        runTest("[[0,0],[1,1],[0,1],[0,2],[1,0],[2,0]]", "B");
        runTest("[[0,0],[1,1],[2,0],[1,0],[1,2],[2,1],[0,1],[0,2],[2,2]]", "Draw");
        runTest("[[0,0],[1,1]]", "Pending");
        runTest("[[1,1],[2,0],[0,2]]", "Pending");
    }
}