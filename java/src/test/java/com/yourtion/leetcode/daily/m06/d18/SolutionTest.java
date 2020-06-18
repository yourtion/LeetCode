package com.yourtion.leetcode.daily.m06.d18;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200618")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("1-2--3--4-5--6--7", "[1, 2, 5, 3, 4, 6, 7]"),
                arguments("1-2--3---4-5--6---7", "[1, 2, 5, 3, null, 6, null, 4, null, 7, null]"),
                arguments("1-401--349---90--88", "[1, 401, null, 349, 88, 90, null]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void recoverFromPreOrder(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        TreeNode ret = new Solution().recoverFromPreorder(source);
        Assertions.assertEquals(res, TestUtils.treeNodeToString(ret));
    }
}