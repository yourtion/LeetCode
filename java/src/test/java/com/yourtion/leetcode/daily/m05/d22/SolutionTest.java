package com.yourtion.leetcode.daily.m05.d22;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200521")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[3,9,20,15,7]", "[9,3,15,20,7]", "[3, 9, 20, 15, 7]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void buildTree(String pre, String in, String res) {
        System.out.printf("runTest: %s %s , res: %s", pre, in, res);
        int[] preArr = TestUtils.stringToIntegerArray(pre);
        int[] inArr = TestUtils.stringToIntegerArray(in);
        TreeNode ret = new Solution().buildTree(preArr, inArr);
        Assertions.assertEquals(res, TestUtils.treeNodeToString(ret));
    }
}