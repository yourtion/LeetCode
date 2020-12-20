package com.yourtion.leetcode.easy.c9056;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题28. 对称的二叉树")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,2,3,4,4,3]", true),
                arguments("[1,2,2,null,3,null,3]", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isSymmetric(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().isSymmetric(root));
    }
}