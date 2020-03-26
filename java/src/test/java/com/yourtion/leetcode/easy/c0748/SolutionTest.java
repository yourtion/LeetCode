package com.yourtion.leetcode.easy.c0748;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String words, String res) {
        System.out.printf("runTest: %s %s , res: %s \n", source, words, res);
        String[] ss = TestUtils.stringToStringArray(words);
        Assertions.assertEquals(res, new Solution().shortestCompletingWord(source, ss));
    }

    @Test
    void shortestCompletingWord() {
        runTest("1s3 PSt", "step,steps,stripe,stepple", "steps");
        runTest("1s3 456", "looks,pest,stew,show", "pest");
    }
}