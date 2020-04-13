package com.yourtion.leetcode.easy.c0985;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String a, String query, String res) {
        System.out.printf("runTest: %s %s, res: %s \n", a, query, res);
        int[] ss = TestUtils.stringToIntegerArray(a);
        int[][] sq = TestUtils.stringToInt2dArray(query);
        int[] ret = new Solution().sumEvenAfterQueries(ss, sq);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }

    @Test
    void sumEvenAfterQueries() {
        runTest("[1,2,3,4]", "[[1,0],[-3,1],[-4,0],[2,3]]", "[8, 6, 2, 4]");
        runTest("[1,2,3]", "[]", "[]");
    }
}