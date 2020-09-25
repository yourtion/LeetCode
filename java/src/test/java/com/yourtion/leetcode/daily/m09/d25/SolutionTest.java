package com.yourtion.leetcode.daily.m09.d25;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200925")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[9,3,15,20,7]", "[9,15,7,20,3]", "[3, 9, 20, 15, 7]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void buildTree(String inOrder, String postOrder, String res) {
        System.out.printf("runTest: %s %s, res: %s", inOrder, postOrder, res);
        int[] in = TestUtils.stringToIntegerArray(inOrder);
        int[] post = TestUtils.stringToIntegerArray(postOrder);
        TreeNode ret = new Solution().buildTree(in, post);
        Assertions.assertEquals(res, TestUtils.treeNodeToString(ret));
    }
}