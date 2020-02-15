package com.yourtion.leetcode.easy.c0234;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b \n", source, res);
        ListNode n = TestUtils.stringToListNode(source);
        Assertions.assertEquals(res, new Solution().isPalindrome(n));
    }

    @Test
    void isPalindrome() {
        runTest("[1, 2]", false);
        runTest("[1,2,2,1]", true);
        runTest("[1,1]", true);
        runTest("[1,2,1]", true);
        runTest("[]", true);
        runTest("[1,2,3,3,1]", false);
    }
}