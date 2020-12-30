package com.yourtion.leetcode.easy.c9074;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Stack;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 68 - I. 二叉搜索树的最近公共祖先")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[6,2,8,0,4,7,9,null,null,3,5]", 2, 8, 6),
                arguments("[6,2,8,0,4,7,9,null,null,3,5]", 2, 4, 2),
                arguments("[6,2,8,0,4,7,9,null,null,3,5]", 3, 9, 6),
                arguments("[6,2,8]", 2, 8, 6)
        );
    }

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

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void lowestCommonAncestor(String source, int p, int q, int res) {
        System.out.printf("runTest: %s %d %d , res: %d", source, p, q, res);
        TreeNode tn = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, lowestCommonAncestor(tn, p, q).val);
    }
}