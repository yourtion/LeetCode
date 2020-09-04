package com.yourtion.leetcode.daily.m09.d04;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200904")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,null,5]", "1->2->5,1->3"),
                arguments("[1,2,3,4,5]", "1->2->4,1->2->5,1->3")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void binaryTreePaths(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        List<String> ret = Arrays.asList(res.split(","));
        TreeNode tn = TestUtils.stringToTreeNode(source);
        Assertions.assertLinesMatch(ret, new Solution().binaryTreePaths(tn));
    }
}