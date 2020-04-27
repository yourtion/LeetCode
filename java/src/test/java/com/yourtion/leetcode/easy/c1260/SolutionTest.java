package com.yourtion.leetcode.easy.c1260;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    void runTest(String source, int k, String res) {
        System.out.printf("runTest: %s %d , res: %s \n", source, k, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        List<List<Integer>> ret = new Solution().shiftGrid(ss, k);
        Assertions.assertEquals(res, TestUtils.int2dListToString(ret));
    }

    @Test
    void shiftGrid() {
        runTest("[[1,2,3],[4,5,6],[7,8,9]]", 1, "[[9, 1, 2],[3, 4, 5],[6, 7, 8]]");
        runTest("[[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]]", 4,
                "[[12, 0, 21, 13],[3, 8, 1, 9],[19, 7, 2, 5],[4, 6, 11, 10]]");
        runTest("[[1,2,3],[4,5,6],[7,8,9]]", 9, "[[1, 2, 3],[4, 5, 6],[7, 8, 9]]");
    }
}