package com.yourtion.leetcode.daily.m07.d03;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200703")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[-10,-3,0,5,9]", "[0, -3, 9, -10, null, 5, null]"),
                arguments("[-12,-10,-5,-3,0,5,9,12,15]", "[0, -5, 12, -10, -3, 9, 15, -12, null, 5, null]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void sortedArrayToBST(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        TreeNode root = new Solution().sortedArrayToBST(ss);
        Assertions.assertEquals(res, TestUtils.treeNodeToString(root));
    }
}