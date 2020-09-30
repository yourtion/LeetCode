package com.yourtion.leetcode.daily.m09.d30;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200930")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[4,2,7,1,3]", 5, "[4, 2, 7, 1, 3, 5, null]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void insertIntoBST(String source, int val, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, val, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        TreeNode ret = new Solution().insertIntoBST(root, val);
        Assertions.assertEquals(res, TestUtils.treeNodeToString(ret));
    }
}