package com.yourtion.leetcode.daily.m08.d07;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200807")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3]", "[1,2,3]", true),
                arguments("[1,2]", "[1,null,2]", false),
                arguments("[1,2,1]", "[1,1,2]", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isSameTree(String tree1, String tree2, boolean res) {
        System.out.printf("runTest: %s %s, res: %b", tree1, tree2, res);
        TreeNode tn1 = TestUtils.stringToTreeNode(tree1);
        TreeNode tn2 = TestUtils.stringToTreeNode(tree2);
        Assertions.assertEquals(res, new Solution().isSameTree(tn1, tn2));
    }
}