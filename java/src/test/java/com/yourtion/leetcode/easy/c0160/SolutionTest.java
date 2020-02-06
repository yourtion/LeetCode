package com.yourtion.leetcode.easy.c0160;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String s1, String s2, int sk1, int sk2, int res) {
        System.out.printf("runTest: %s %d + %s %d , res: %d \n", s1, sk1, s2, sk2, res);
        ListNode tn1 = TestUtils.stringToListNode(s1);
        ListNode tn2 = TestUtils.stringToListNode(s2);
        ListNode r = TestUtils.combineList(tn1, tn2, sk1, sk2);
        ListNode ret = new Solution().getIntersectionNode(tn1, tn2);
        if (r != null) {
            Assertions.assertEquals(res, ret.val);
            Assertions.assertEquals(r, ret);
        } else {
            Assertions.assertNull(ret);
        }

    }

    @Test
    void getIntersectionNode() {
        runTest("[4,1,8,4,5]", "[5,0,1,8,4,5]", 2, 3, 8);
        runTest("[0,9,1,2,4]", "[3,2,4]", 3, 1, 2);
        runTest("[2,6,4]", "[1,5]", 3, 2, 0);
    }
}