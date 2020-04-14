package com.yourtion.leetcode.easy.c0993;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int x, int y, boolean res) {
        System.out.printf("runTest: %s %d %d , res: %b \n", source, x, y, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().isCousins(root, x, y));
    }

    @Test
    void isCousins() {
        runTest("[1,2,3,4]", 4, 3, false);
        runTest("[1,2,3,null,4,null,5]", 5, 4, true);
        runTest("[1,2,3,null,4]", 2, 3, false);
    }
}