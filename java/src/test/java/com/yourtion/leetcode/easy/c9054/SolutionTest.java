package com.yourtion.leetcode.easy.c9054;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题25. 合并两个排序的链表")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,4]", "[1,3,4]", "[1, 1, 2, 3, 4, 4]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void mergeTwoLists(String l1, String l2, String res) {
        System.out.printf("runTest: %s %s , res: %s", l1, l2, res);
        ListNode l1l = TestUtils.stringToListNode(l1);
        ListNode l2l = TestUtils.stringToListNode(l2);
        ListNode ret = new Solution().mergeTwoLists(l1l, l2l);
        Assertions.assertEquals(res, TestUtils.listNodeToString(ret));
    }

}