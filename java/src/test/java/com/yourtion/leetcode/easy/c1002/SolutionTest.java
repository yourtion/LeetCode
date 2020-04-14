package com.yourtion.leetcode.easy.c1002;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SolutionTest {
    void runTest(String[] source, String res) {
        System.out.printf("runTest: %s , res: %s \n", Arrays.toString(source), res);
        List<String> ret = new Solution().commonChars(source);
        Assertions.assertEquals(res, Arrays.toString(ret.toArray()));
    }

    @Test
    void commonChars() {
        runTest(new String[]{"bella", "label", "roller"}, "[e, l, l]");
        runTest(new String[]{"cool", "lock", "cook"}, "[c, o]");
    }
}