package com.yourtion.leetcode.daily.m09.d16;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200916")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[4,2,7,1,3,6,9]", "[4, 7, 2, 9, 6, 3, 1]"),
                arguments("[]", "[]"),
                arguments("[1]", "[1]"),
                arguments("[1,3]", "[1, null, 3]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void invertTree(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        TreeNode tn1 = TestUtils.stringToTreeNode(source);
        String ret = TestUtils.treeNodeToString(new Solution().invertTree(tn1));
        Assertions.assertEquals(res, ret);
    }
}