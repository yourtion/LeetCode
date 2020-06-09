package com.yourtion.leetcode.medium.c0092;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("92. 反转链表 II")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,4,5]", 2, 4, "[1, 4, 3, 2, 5]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void reverseBetween(String source, int m, int n, String res) {
        System.out.printf("runTest: %s %d %d , res: %s", source, m, n, res);
        ListNode head = TestUtils.stringToListNode(source);
        ListNode ret = new Solution().reverseBetween(head, m, n);
        Assertions.assertEquals(res, TestUtils.listNodeToString(ret));
    }
}