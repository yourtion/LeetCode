package com.yourtion.leetcode.easy.c0811;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {

    void runTest(String[] source, String[] res) {
        System.out.printf("runTest: %s , res: %s \n", Arrays.toString(source), Arrays.toString(res));
        Assertions.assertArrayEquals(res, new Solution().subdomainVisits(source).toArray());
    }

    @Test
    void subdomainVisits() {
        runTest(new String[]{"9001 discuss.leetcode.com"}, new String[]{"9001 com", "9001 leetcode.com", "9001 discuss.leetcode.com"});
        runTest(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"},
                new String[]{"951 com", "900 google.mail.com", "1 intel.mail.com", "5 org", "5 wiki.org", "901 mail.com", "50 yahoo.com"});

    }
}