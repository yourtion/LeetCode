package com.yourtion.leetcode.daily.m04.d25;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        List<List<Integer>> ret = new Solution().permute(ss);
        Assertions.assertEquals(res, TestUtils.int2dListToString(ret));
    }

    @Test
    void permute() {
        runTest("[1,2,3]", "[[1, 2, 3],[1, 3, 2],[2, 1, 3],[2, 3, 1],[3, 2, 1],[3, 1, 2]]");
        runTest("[1,2]", "[[1, 2],[2, 1]]");
    }
}