package com.yourtion.leetcode.easy.c0501;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        String ret = TestUtils.integerArrayToString(new Solution().findMode(root));
        Assertions.assertEquals(res, ret);
    }

    @Test
    void findMode() {
        runTest(" [1,null,2,2]", "[2]");
        runTest(" [1,1,2,2]", "[1, 2]");
    }
}