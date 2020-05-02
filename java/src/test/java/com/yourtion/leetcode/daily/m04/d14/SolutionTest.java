package com.yourtion.leetcode.daily.m04.d14;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200414")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[7,2,4,3]", "[5,6,4]", "[7, 8, 0, 7]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void addTwoNumbers(String l1, String l2, String res) {
        System.out.printf("runTest: %s %s , res: %s ", l1, l2, res);
        ListNode s1 = TestUtils.stringToListNode(l1);
        ListNode s2 = TestUtils.stringToListNode(l2);
        ListNode ret = new Solution().addTwoNumbers(s1, s2);
        Assertions.assertEquals(res, TestUtils.listNodeToString(ret));
    }
}