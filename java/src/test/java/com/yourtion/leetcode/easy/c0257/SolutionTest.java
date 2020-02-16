package com.yourtion.leetcode.easy.c0257;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        List<String> ret = Arrays.asList(res.split(","));
        TreeNode tn = TestUtils.stringToTreeNode(source);
        Assertions.assertLinesMatch(ret, new Solution().binaryTreePaths(tn));
    }

    @Test
    void binaryTreePaths() {
        runTest("[1,2,3,null,5]", "1->2->5,1->3");
        runTest("[1,2,3,4,5]", "1->2->4,1->2->5,1->3");
    }
}