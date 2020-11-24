package com.yourtion.leetcode.daily.m11.d24;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201124")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,4,5,6]", 6)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void countNodes(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().countNodes(root));
    }
}