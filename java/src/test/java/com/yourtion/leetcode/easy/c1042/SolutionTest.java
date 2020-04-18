package com.yourtion.leetcode.easy.c1042;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(int n, String paths, String res) {
        System.out.printf("runTest: %d %s , res: %s \n", n, paths, res);
        int[][] ss = TestUtils.stringToInt2dArray(paths);
        int[] ret = new Solution().gardenNoAdj(n, ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }

    @Test
    void gardenNoAdj() {
        runTest(3, "[[1,2],[2,3],[3,1]]", "[1, 2, 3]");
        runTest(4, "[[1,2],[3,4]]", "[1, 2, 1, 2]");
        runTest(4, "[[1,2],[2,3],[3,4],[4,1],[1,3],[2,4]]", "[1, 2, 3, 4]");
    }
}