package com.yourtion.leetcode.daily.m11.d20;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201120")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[4,2,1,3]", "[1, 2, 3, 4]"),
                arguments("[-1,5,3,4,0]", "[-1, 0, 3, 4, 5]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void insertionSortList(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        ListNode head = TestUtils.stringToListNode(source);
        ListNode ret = new Solution().insertionSortList(head);
        Assertions.assertEquals(res, TestUtils.listNodeToString(ret));
    }
}