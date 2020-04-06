package com.yourtion.leetcode.easy.c0893;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        String[] ss = TestUtils.stringToStringArray(source);
        Assertions.assertEquals(res, new Solution().numSpecialEquivGroups(ss));
    }

    @Test
    void numSpecialEquivGroups() {
        runTest("a,b,c,a,c,c", 3);
        runTest("aa,bb,ab,ba", 4);
        runTest("abc,acb,bac,bca,cab,cba", 3);
        runTest("abcd,cdab,adcb,cbad", 1);
    }
}