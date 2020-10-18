package com.yourtion.leetcode.daily.m10.d18;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201018")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,4,5]", 2, "[1, 2, 3, 5]"),
                arguments("[1]", 1, "[]"),
                arguments("[1,2]", 2, "[2]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void removeNthFromEnd(String source, int n, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, n, res);
        ListNode head = TestUtils.stringToListNode(source);
        ListNode ret = new Solution().removeNthFromEnd(head, n);
        Assertions.assertEquals(res, TestUtils.listNodeToString(ret));
    }
}