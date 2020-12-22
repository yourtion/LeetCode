package com.yourtion.leetcode.daily.m12.d22;

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

@DisplayName("每日一题 - 20201221")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[3,9,20,null,null,15,7]", "[[3],[20, 9],[15, 7]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void zigzagLevelOrder(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        List<List<Integer>> ret = new Solution().zigzagLevelOrder(root);
        Assertions.assertEquals(res, TestUtils.int2dListToString(ret));
    }
}