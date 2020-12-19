package com.yourtion.leetcode.easy.c9055;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题27. 二叉树的镜像")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[4,2,7,1,3,6,9]", "[4, 7, 2, 9, 6, 3, 1]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void mirrorTree(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        TreeNode ret = new Solution().mirrorTree(root);
        Assertions.assertEquals(res, TestUtils.treeNodeToString(ret));
    }
}