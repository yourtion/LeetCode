package com.yourtion.leetcode.easy.c0830;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        List<List<Integer>> ret = new Solution().largeGroupPositions(source);
        Assertions.assertEquals(res, TestUtils.int2dListToString(ret));
    }

    @Test
    void largeGroupPositions() {
        runTest("abbxxxxzzy", "[[3, 6]]");
        runTest("abc", "[]");
        runTest("abcdddeeeeaabbbcd", "[[3, 5],[6, 9],[12, 14]]");
        runTest("aaa", "[[0, 2]]");
    }
}