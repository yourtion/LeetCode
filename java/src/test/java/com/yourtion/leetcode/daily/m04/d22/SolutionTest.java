package com.yourtion.leetcode.daily.m04.d22;

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

@DisplayName("每日一题 - 20200422")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,null,5,null,4]", "[1, 3, 4]"),
                arguments("[1,2,3,null,5,null,4,0]", "[1, 3, 4, 0]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void rightSideView(String source, String res) {
        System.out.printf("runTest: %s , res: %s ", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        List<Integer> ret = new Solution().rightSideView(root);
        Assertions.assertEquals(res, TestUtils.integerArrayListToString(ret));
    }
}