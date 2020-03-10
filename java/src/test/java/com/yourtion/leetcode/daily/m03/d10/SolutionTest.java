package com.yourtion.leetcode.daily.m03.d10;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().diameterOfBinaryTree(root));
    }

    @Test
    void diameterOfBinaryTree() {
        runTest("[1,2,3,4,5]", 3);
        runTest("[2,3,null,1]", 2);
        runTest("[1]", 0);
    }
}