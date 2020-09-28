package com.yourtion.leetcode.daily.m09.d28;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.binary.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200928")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,4,5,null,7]", "[1, 2, 3, 4, 5, null, 7, null, null, null, null, null, null]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void connect(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        Node root = TestUtils.stringToBinaryTreeNode(source);
        Node ret = new Solution().connect(root);
        Assertions.assertEquals(res, TestUtils.binaryTreeNodeToString(ret));
    }
}