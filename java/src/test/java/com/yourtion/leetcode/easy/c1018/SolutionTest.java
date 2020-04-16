package com.yourtion.leetcode.easy.c1018;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        List<Boolean> ret = new Solution().prefixesDivBy5(ss);
        Assertions.assertEquals(res, Arrays.toString(ret.toArray()));
    }

    @Test
    void prefixesDivBy5() {
        runTest("[0,1,1]", "[true, false, false]");
        runTest("[1,1,1]", "[false, false, false]");
        runTest("[0,1,1,1,1,1]", "[true, false, false, false, true, false]");
        runTest("[1,1,1,0,1]", "[false, false, false, false, false]");
    }
}