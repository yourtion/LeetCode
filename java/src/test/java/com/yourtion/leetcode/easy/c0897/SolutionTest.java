package com.yourtion.leetcode.easy.c0897;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        TreeNode ret = new Solution().increasingBST(root);
        Assertions.assertEquals(res, TestUtils.treeNodeToString(ret));
    }

    @Test
    void increasingBST() {
        runTest("[5,3,6,2,4,null,8,1,null,null,null,7,9]",
                "[1, null, 2, null, 3, null, 4, null, 5, null, 6, null, 7, null, 8, null, 9]");
        runTest("[5,3,6,2,4,null,8,null,null,null,null,7,9]",
                "[2, null, 3, null, 4, null, 5, null, 6, null, 7, null, 8, null, 9]");
    }
}