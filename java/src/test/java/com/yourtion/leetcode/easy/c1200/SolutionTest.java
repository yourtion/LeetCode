package com.yourtion.leetcode.easy.c1200;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        List<List<Integer>> ret = new Solution().minimumAbsDifference(ss);
        Assertions.assertEquals(res, TestUtils.int2dListToString(ret));
    }

    @Test
    void minimumAbsDifference() {
        runTest("[4,2,1,3]", "[[1, 2],[2, 3],[3, 4]]");
        runTest("[1,3,6,10,15]", "[[1, 3]]");
        runTest("[3,8,-10,23,19,-4,-14,27]", "[[-14, -10],[19, 23],[23, 27]]");
    }
}