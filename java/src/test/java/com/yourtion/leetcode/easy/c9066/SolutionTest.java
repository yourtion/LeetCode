package com.yourtion.leetcode.easy.c9066;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题55 - I. 二叉树的深度")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[3,9,20,null,null,15,7]", 3),
                arguments("[]", 0),
                arguments("[1]", 1)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void maxDepth(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().maxDepth(root));
    }
}