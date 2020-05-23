package com.yourtion.leetcode.easy.c9043;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题06. 从尾到头打印链表")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,3,2]", "[2, 3, 1]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void reversePrint(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        ListNode head = TestUtils.stringToListNode(source);
        int[] ret = new Solution().reversePrint(head);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}