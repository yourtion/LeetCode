package com.yourtion.leetcode.daily.m05.d07;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.easy.c0572.Solution;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200507")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[3,4,5,1,2]", "[4,1,2]", true),
                arguments("[3,4,5,1,2,null,null,null,null,0]", "[4,1,2]", false),
                arguments("[3,4,5,1]", "[4,1]", true),
                arguments("[1,1]", "[1]", true),
                arguments("[3,4,5,1,null,2]", "[3,1,2]", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isSubtree(String t1, String t2, boolean res) {
        System.out.printf("runTest: %s %s , res: %b", t1, t2, res);
        TreeNode t1n = TestUtils.stringToTreeNode(t1);
        TreeNode t2n = TestUtils.stringToTreeNode(t2);
        Assertions.assertEquals(res, new Solution().isSubtree(t1n, t2n));
    }
}