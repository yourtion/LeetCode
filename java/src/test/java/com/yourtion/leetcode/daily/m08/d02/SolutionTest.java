package com.yourtion.leetcode.daily.m08.d02;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200802")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,5,3,4,null,6]", "[1, null, 2, null, 3, null, 4, null, 5, null, 6]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void flatten(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        new Solution().flatten(root);
        Assertions.assertEquals(res, TestUtils.treeNodeToString(root));
    }
}