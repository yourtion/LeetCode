package com.yourtion.leetcode.easy.c0783;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().minDiffInBST(root));
    }

    @Test
    void minDiffInBST() {
        runTest("[4,2,6,1,3,null,null]", 1);
        runTest("[4,2,6]", 2);
        runTest("[90,69,null,49,89,null,52,null,null,null,null]", 1);

    }
}