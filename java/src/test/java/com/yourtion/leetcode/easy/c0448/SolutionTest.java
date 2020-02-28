package com.yourtion.leetcode.easy.c0448;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        List<Integer> ret = new Solution().findDisappearedNumbers(ss);
        Assertions.assertEquals(res, ret.toString());
    }

    @Test
    void findDisappearedNumbers() {
        runTest("[4,3,2,7,8,2,3,1]", "[5, 6]");
        runTest("[4,3,2,7,5,2,3,1]", "[6, 8]");
    }
}