package com.yourtion.leetcode.easy.c0606;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().tree2str(root));
    }

    @Test
    void tree2str() {
        runTest("[1,2,3,4]", "1(2(4))(3)");
        runTest("[1,2,3,null,4]", "1(2()(4))(3)");
        runTest("[]", "");
    }
}