package com.yourtion.leetcode.daily.m10.d12;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201012")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,null,3,2]", 1),
                arguments("[236,104,701,null,227,null,911]", 9),
                arguments("[600,424,612,null,499,null,689]", 12)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void getMinimumDifference(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().getMinimumDifference(root));
    }
}