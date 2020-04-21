package com.yourtion.leetcode.easy.c1128;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().numEquivDominoPairs(ss));
    }

    @Test
    void numEquivDominoPairs() {
        runTest("[[1,2],[2,1],[3,4],[5,6]]", 1);
        runTest("[[1,2],[2,1],[3,4],[5,6],[5,6]]", 2);
        runTest("[[1,2],[1,2],[1,1],[1,2],[2,2]]", 3);
    }
}