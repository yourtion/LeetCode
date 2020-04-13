package com.yourtion.leetcode.easy.c0989;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {
    void runTest(String source, int k, String res) {
        System.out.printf("runTest: %s %d, res: %s \n", source, k, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        List<Integer> ret = new Solution().addToArrayForm(ss, k);
        Assertions.assertEquals(res, TestUtils.integerArrayListToString(ret));
    }

    @Test
    void addToArrayForm() {
        runTest("[1,2,0,0]", 34, "[1, 2, 3, 4]");
        runTest("[2,7,4]", 181, "[4, 5, 5]");
        runTest("[2,1,5]", 806, "[1, 0, 2, 1]");
        runTest("[9,9,9,9,9,9,9,9,9,9]", 1, "[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }
}