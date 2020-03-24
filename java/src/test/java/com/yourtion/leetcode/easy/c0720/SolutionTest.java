package com.yourtion.leetcode.easy.c0720;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        String[] ss = TestUtils.stringToStringArray(source);
        Assertions.assertEquals(res, new Solution().longestWord(ss));
    }

    @Test
    void longestWord() {
        runTest("w,wo,wor,worl,world", "world");
        runTest("a,banana,app,appl,ap,apply,apple", "apple");
    }
}