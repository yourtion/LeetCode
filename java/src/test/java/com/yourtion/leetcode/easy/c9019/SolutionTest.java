package com.yourtion.leetcode.easy.c9019;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 04.04. 检查平衡性")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[3,9,20,null,null,15,7]", true),
                arguments("[1,2,2,3,3,null,null,4,4]", false),
                arguments("[1,2,2,3,null,null,3,4,null,null,4]", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isBalanced(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().isBalanced(root));
    }
}