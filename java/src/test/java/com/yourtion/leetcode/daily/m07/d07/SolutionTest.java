package com.yourtion.leetcode.daily.m07.d07;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200707")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[5,4,8,11,null,13,4,7,2,null,null,null,1]", 22, true),
                arguments("[]", 1, false),
                arguments("[5]", 5, true),
                arguments("[1,2]", 3, true),
                arguments("[-2,null,-3]", -5, true)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void hasPathSum(String source, int sum, boolean res) {
        System.out.printf("runTest: %s -> %d, res: %b", source, sum, res);
        TreeNode tn = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().hasPathSum(tn, sum));
    }

}