package com.yourtion.leetcode.daily.m03.d17;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String words, String chars, int res) {
        System.out.printf("runTest: %s %s, res: %d \n", words, chars, res);
        String[] ss = TestUtils.stringToStringArray(words);
        Assertions.assertEquals(res, new Solution().countCharacters(ss, chars));
    }

    @Test
    void countCharacters() {
        runTest("cat,bt,hat,tree", "atach", 6);
        runTest("hello,world,leetcode", "welldonehoneyr", 10);
    }
}