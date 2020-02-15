package com.yourtion.leetcode.easy.c0235;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

class SolutionTest {

    TreeNode lowestCommonAncestor(TreeNode tn, int p, int q) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(tn);
        TreeNode pn = null;
        TreeNode qn = null;
        while (!stack.empty()) {
            TreeNode t = stack.pop();
            if (t.right != null) stack.push(t.right);
            if (t.left != null) stack.push(t.left);
            if (t.val == p) pn = t;
            if (t.val == q) qn = t;
        }
        return new Solution().lowestCommonAncestor(tn, pn, qn);
    }

    void runTest(String source, int p, int q, int res) {
        System.out.printf("runTest: %s %d %d , res: %d \n", source, p, q, res);
        TreeNode tn = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, lowestCommonAncestor(tn, p, q).val);
    }

    @Test
    void lowestCommonAncestor() {
        runTest("[6,2,8,0,4,7,9,null,null,3,5]", 2, 8, 6);
        runTest("[6,2,8,0,4,7,9,null,null,3,5]", 2, 4, 2);
        runTest("[6,2,8,0,4,7,9,null,null,3,5]", 3, 9, 6);
        runTest("[6,2,8]", 2, 8, 6);
    }
}