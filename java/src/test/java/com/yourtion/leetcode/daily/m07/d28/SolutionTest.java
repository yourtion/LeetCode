package com.yourtion.leetcode.daily.m07.d28;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200728")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[3,9,20,null,null,15,7]", 3),
                arguments("[]", 0),
                arguments("[1]", 1),
                arguments("[3,9,20,null,null,15,null]", 3)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void maxDepth(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        TreeNode tn1 = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().maxDepth(tn1));
    }
}