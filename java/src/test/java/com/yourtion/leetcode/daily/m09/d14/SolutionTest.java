package com.yourtion.leetcode.daily.m09.d14;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200914")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,null,2,3]", "[1, 3, 2]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void inorderTraversal(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        List<Integer> ret = new Solution().inorderTraversal(root);
        Assertions.assertEquals(res, TestUtils.integerArrayListToString(ret));
    }
}