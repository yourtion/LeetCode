package com.yourtion.leetcode.daily.m09.d29;

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

@DisplayName("每日一题 - 20200929")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,null,2,3]", "[3, 2, 1]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void postorderTraversal(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        TreeNode root = TestUtils.stringToTreeNode(source);
        List<Integer> ret = new Solution().postorderTraversal(root);
        Assertions.assertEquals(res, TestUtils.integerArrayListToString(ret));
    }
}