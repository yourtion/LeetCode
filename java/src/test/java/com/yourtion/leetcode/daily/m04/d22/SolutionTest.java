package com.yourtion.leetcode.daily.m04.d22;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        List<Integer> ret = new Solution().rightSideView(root);
        Assertions.assertEquals(res, TestUtils.integerArrayListToString(ret));
    }

    @Test
    void rightSideView() {
        runTest("[1,2,3,null,5,null,4]", "[1, 3, 4]");
        runTest("[1,2,3,null,5,null,4,0]", "[1, 3, 4, 0]");
    }
}