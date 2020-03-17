package com.yourtion.leetcode.easy.c0669;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int l, int r, String res) {
        System.out.printf("runTest: %s %d, %d , res: %s \n", source, l, r, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        String ret = TestUtils.treeNodeToString(new Solution().trimBST(root, l, r));
        Assertions.assertEquals(res, ret);
    }

    @Test
    void trimBST() {
        runTest("[1,0,2]", 1, 2, "[1, null, 2]");
        runTest("[3,0,4,null,2,null,null,1]", 1, 3, "[3, 2, null, 1, null]");
        runTest("[4,2,5,1,3,6]", 0, 2, "[2, 1, null]");
        runTest("[3,1,4,null,2]", 1, 2, "[1, null, 2]");
    }
}