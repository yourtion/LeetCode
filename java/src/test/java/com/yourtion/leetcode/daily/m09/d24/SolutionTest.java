package com.yourtion.leetcode.daily.m09.d24;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200924")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(" [1,null,2,2]", "[2]"),
                arguments(" [1,1,2,2]", "[1, 2]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findMode(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        String ret = TestUtils.integerArrayToString(new Solution().findMode(root));
        Assertions.assertEquals(res, ret);
    }
}