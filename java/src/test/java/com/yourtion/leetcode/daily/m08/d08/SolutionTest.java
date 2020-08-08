package com.yourtion.leetcode.daily.m08.d08;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200808")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,3,null,null,2]", "[3, 1, null, null, 2]"),
                arguments("[3,1,4,null,null,2]", "[2, 1, 4, 3, null]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void recoverTree(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        new Solution().recoverTree(root);
        Assertions.assertEquals(res, TestUtils.treeNodeToString(root));
    }
}