package com.yourtion.leetcode.easy.c0997;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int n, String trust, int res) {
        System.out.printf("runTest: %d %s , res: %d \n", n, trust, res);
        int[][] ss = TestUtils.stringToInt2dArray(trust);
        Assertions.assertEquals(res, new Solution().findJudge(n, ss));
    }

    @Test
    void findJudge() {
        runTest(2, "[[1,2]]", 2);
        runTest(3, "[[1,3],[2,3]]", 3);
        runTest(3, "[[1,3],[2,3],[3,1]]", -1);
        runTest(3, "[[1,2],[2,3]]", -1);
        runTest(4, "[[1,3],[1,4],[2,3],[2,4],[4,3]]", 3);
    }
}