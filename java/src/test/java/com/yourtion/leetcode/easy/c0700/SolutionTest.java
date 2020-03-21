package com.yourtion.leetcode.easy.c0700;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int val, String res) {
        System.out.printf("runTest: %s %d, res: %s \n", source, val, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        TreeNode ret = new Solution().searchBST(root, val);
        Assertions.assertEquals(res, TestUtils.treeNodeToString(ret));
    }

    @Test
    void searchBST() {
        runTest("[4,2,7,1,3]", 2, "[2, 1, 3]");
        runTest("[2,1,3]", 5, "[]");
    }
}