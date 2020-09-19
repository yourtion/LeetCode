package com.yourtion.leetcode.daily.m09.d19;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200919")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[3,9,20,null,null,15,7]", 24),
                arguments("[3,9,20,6,null,15,7]", 21),
                arguments("[]", 0),
                arguments("[1]", 0)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void sumOfLeftLeaves(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        TreeNode tn = TestUtils.stringToTreeNode(source);
        Assertions.assertEquals(res, new Solution().sumOfLeftLeaves(tn));
    }
}