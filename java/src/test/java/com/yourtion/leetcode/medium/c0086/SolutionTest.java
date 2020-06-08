package com.yourtion.leetcode.medium.c0086;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("86. 分隔链表")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,4,3,2,5,2]", 3, "[1, 2, 2, 4, 3, 5]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void partition(String source, int x, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, x, res);
        ListNode head = TestUtils.stringToListNode(source);
        ListNode ret = new Solution().partition(head, x);
        Assertions.assertEquals(res, TestUtils.listNodeToString(ret));
    }
}