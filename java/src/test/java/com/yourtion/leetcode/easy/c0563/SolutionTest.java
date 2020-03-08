package com.yourtion.leetcode.easy.c0563;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().findTilt(root));
    }

    @Test
    void findTilt() {
        runTest("[1,2,3]", 1);
        runTest("[1,2,3,4]", 7);
    }
}