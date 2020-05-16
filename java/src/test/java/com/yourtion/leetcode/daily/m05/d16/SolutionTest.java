package com.yourtion.leetcode.daily.m05.d16;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200516")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,4,5]", 2, "[2, 1, 4, 3, 5]"),
                arguments("[1,2,3,4,5]", 3, "[3, 2, 1, 4, 5]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void reverseKGroup(String source, int k, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, k, res);
        ListNode head = TestUtils.stringToListNode(source);
        ListNode ret = new Solution().reverseKGroup(head, k);
        Assertions.assertEquals(res, TestUtils.listNodeToString(ret));
    }
}