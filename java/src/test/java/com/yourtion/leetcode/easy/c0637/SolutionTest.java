package com.yourtion.leetcode.easy.c0637;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().averageOfLevels(root).toString());
    }

    @Test
    void averageOfLevels() {
        runTest("[3,9,20,null,null,15,7]", "[3.0, 14.5, 11.0]");
        runTest("[3]", "[3.0]");
        runTest("[2147483647,2147483647,2147483647]", "[2.147483647E9, 2.147483647E9]");
    }
}