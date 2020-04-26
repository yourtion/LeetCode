package com.yourtion.leetcode.easy.c1232;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().checkStraightLine(ss));
    }

    @Test
    void checkStraightLine() {
//        runTest("[[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]", true);
//        runTest("[[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]", false);
//        runTest("[[1,2],[3,4],[4,5],[6,7]]", true);
//        runTest("[[0,0],[0,1],[0,9],[0,3]]", true);
        runTest("[[1,0],[2,0],[4,0],[9,0]]", true);
    }
}