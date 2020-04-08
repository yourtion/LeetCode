package com.yourtion.leetcode.easy.c0922;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        new Solution().sortArrayByParityII(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ss));
    }

    @Test
    void sortArrayByParityII() {
        runTest("[4,2,5,7]", "[4, 5, 2, 7]");
        runTest("[0,1]", "[0, 1]");
        runTest("[]", "[]");
        runTest("[1,0]", "[0, 1]");
    }
}