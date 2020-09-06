package com.yourtion.leetcode.daily.m09.d06;

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

@DisplayName("每日一题 - 20200906")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[3,9,20,null,null,15,7]", "[[15, 7],[9, 20],[3]]"),
                arguments("[3]", "[[3]]"),
                arguments("[3,9,20,null,null,null,7]", "[[7],[9, 20],[3]]"),
                arguments("[1,2,3,4,null,null,5]", "[[4, 5],[2, 3],[1]]"),
                arguments("[3,9,20,11,12,13,7]", "[[11, 12, 13, 7],[9, 20],[3]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void levelOrderBottom(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        List<List<Integer>> ret = new Solution().levelOrderBottom(root);
        Assertions.assertEquals(res, TestUtils.int2dListToString(ret));
    }
}