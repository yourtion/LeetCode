package com.yourtion.leetcode.easy.c9011;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 02.01. 移除重复节点")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1, 2, 3, 3, 2, 1]", "[1, 2, 3]"),
                arguments("[1, 1, 1, 1, 2]", "[1, 2]"),
                arguments("[]", "[]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void removeDuplicateNodes(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        ListNode head = TestUtils.stringToListNode(source);
        ListNode ret = new Solution().removeDuplicateNodes(head);
        Assertions.assertEquals(res, TestUtils.listNodeToString(ret));
    }
}