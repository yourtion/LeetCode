package com.yourtion.leetcode.daily.m09.d12;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200912")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[3,9,20,null,null,15,7]", "[3.0, 14.5, 11.0]"),
                arguments("[3]", "[3.0]"),
                arguments("[2147483647,2147483647,2147483647]", "[2.147483647E9, 2.147483647E9]")

        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void averageOfLevels(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().averageOfLevels(root).toString());
    }
}