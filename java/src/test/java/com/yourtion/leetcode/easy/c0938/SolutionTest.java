package com.yourtion.leetcode.easy.c0938;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int l, int r, int res) {
        System.out.printf("runTest: %s %d %d, res: %d \n", source, l, r, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().rangeSumBST(root, l, r));
    }

    @Test
    void rangeSumBST() {
        runTest("[10,5,15,3,7,null,18]", 7, 15, 32);
        runTest("[10,5,15,3,7,13,18,1,null,6]", 6, 10, 23);
        runTest("[18,9,27,6,15,24,30,3,null,12,null,21]", 18, 24, 63);
    }
}