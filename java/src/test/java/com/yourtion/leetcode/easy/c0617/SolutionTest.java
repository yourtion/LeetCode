package com.yourtion.leetcode.easy.c0617;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String t1, String t2, String res) {
        System.out.printf("runTest: %s %s, res: %s \n", t1, t2, res);
        TreeNode root1 = TestUtils.stringToTreeNode(t1);
        TreeNode root2 = TestUtils.stringToTreeNode(t2);
        String ret = TestUtils.treeNodeToString(new Solution().mergeTrees(root1, root2));
        Assertions.assertEquals(res, ret);
    }


    @Test
    void mergeTrees() {
        runTest("[1,3,2,5]", "[2,1,3,null,4,null,7]", "[3, 4, 5, 5, 4, null, 7]");
        runTest("[]", "[]", "[]");
        runTest("[]", "[2,1,3,null,4,null,7]", "[2, 1, 3, null, 4, null, 7]");
    }
}