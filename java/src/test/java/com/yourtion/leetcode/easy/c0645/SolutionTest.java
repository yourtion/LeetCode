package com.yourtion.leetcode.easy.c0645;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        String ret = TestUtils.integerArrayToString(new Solution().findErrorNums(ss));
        Assertions.assertEquals(res, ret);
    }

    @Test
    void findErrorNums() {
        runTest("[1,2,2,4]", "[2, 3]");
        runTest("[1,5,3,4,4]", "[4, 2]");
        runTest("[5,2,3,4,4]", "[4, 1]");
        runTest("[1,2,3,4,5,2,7]", "[2, 6]");

    }
}