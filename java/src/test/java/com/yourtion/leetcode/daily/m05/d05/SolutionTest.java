package com.yourtion.leetcode.daily.m05.d05;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200505")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[2,1,3]", true),
                arguments("[5,1,4,null,null,3,6]", false),
                arguments("[1,1]", false),
                arguments("[10,5,15,null,null,6,20]", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isValidBST(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().isValidBST(root));
    }
}