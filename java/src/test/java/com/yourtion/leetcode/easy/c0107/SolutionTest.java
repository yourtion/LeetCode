package com.yourtion.leetcode.easy.c0107;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    void runTest(String tree, String res) {
        System.out.printf("runTest: %s, res: %s \n", tree, res);
        TreeNode root = TestUtils.stringToTreeNode(tree);
        List<List<Integer>> ret = new Solution().levelOrderBottom(root);
        Assertions.assertEquals(res, TestUtils.int2dListToString(ret));
    }

    @Test
    void levelOrderBottom() {
        runTest("[3,9,20,null,null,15,7]", "[[15, 7],[9, 20],[3]]");
        runTest("[3]", "[[3]]");
        runTest("[3,9,20,null,null,null,7]", "[[7],[9, 20],[3]]");
        runTest("[1,2,3,4,null,null,5]", "[[4, 5],[2, 3],[1]]");
        runTest("[3,9,20,11,12,13,7]", "[[11, 12, 13, 7],[9, 20],[3]]");
    }
}