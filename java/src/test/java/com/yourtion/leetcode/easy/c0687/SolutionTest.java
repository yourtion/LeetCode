package com.yourtion.leetcode.easy.c0687;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    void runTest(String source, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().longestUnivaluePath(root));
    }

    @Test
    void longestUnivaluePath() {
        runTest("[5,4,5,1,1,null,5]", 2);
        runTest("[1,4,5,4,4,null,5]", 2);
        runTest("[1,1,1,1,2]", 3);
        runTest("[1,null,1,1,1,1,1,1]", 4);
    }
}