package com.yourtion.leetcode.daily.m04.d14;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String l1, String l2, String res) {
        System.out.printf("runTest: %s %s , res: %s \n", l1, l2, res);
        ListNode s1 = TestUtils.stringToListNode(l1);
        ListNode s2 = TestUtils.stringToListNode(l2);
        ListNode ret = new Solution().addTwoNumbers(s1, s2);
        Assertions.assertEquals(res, TestUtils.listNodeToString(ret));
    }

    @Test
    void addTwoNumbers() {
        runTest("[7,2,4,3]", "[5,6,4]", "[7, 8, 0, 7]");
    }
}