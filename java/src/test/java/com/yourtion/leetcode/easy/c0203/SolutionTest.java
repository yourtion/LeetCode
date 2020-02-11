package com.yourtion.leetcode.easy.c0203;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int val, String res) {
        System.out.printf("runTest: %s %d , res: %s \n", source, val, res);
        ListNode n = TestUtils.stringToListNode(source);
        ListNode n2 = new Solution().removeElements(n, val);
        String ret = TestUtils.listNodeToString(n2);
        Assertions.assertEquals(res, ret);
    }

    @Test
    void removeElements() {
        runTest("[1,2,6,3,4,5,6]", 6, "[1, 2, 3, 4, 5]");
        runTest("[1,2,6,3,4,8,6,6]", 6, "[1, 2, 3, 4, 8]");
        runTest("[7,7,7,1,2,6,3,4,5,7,7]", 7, "[1, 2, 6, 3, 4, 5]");

    }
}