package com.yourtion.leetcode.daily.m04.d26;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {

    void runTest(String[] source, String res) {
        System.out.printf("runTest: %s , res: %s \n", Arrays.toString(source), res);
        ListNode[] list = new ListNode[source.length];
        for (int i = 0; i < source.length; i++) {
            list[i] = TestUtils.stringToListNode(source[i]);
        }
        ListNode ret = new Solution().mergeKLists(list);
        Assertions.assertEquals(res, TestUtils.listNodeToString(ret));
    }

    @Test
    void mergeKLists() {
        runTest(new String[]{"[1,4,5]", "[1,3,4]", "[2,6]"}, "[1, 1, 2, 3, 4, 4, 5, 6]");
    }
}