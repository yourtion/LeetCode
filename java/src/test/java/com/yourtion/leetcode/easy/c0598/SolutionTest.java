package com.yourtion.leetcode.easy.c0598;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(int m, int n, String source, int res) {
        System.out.printf("runTest: %s %d %d, res: %d \n", source, m, n, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().maxCount(m, n, ss));
    }


    @Test
    void maxCount() {
        runTest(3, 3, "[[2,2],[3,3]]", 4);
        runTest(5, 5, "[[2,2],[3,3],[1,1]]", 1);
    }
}