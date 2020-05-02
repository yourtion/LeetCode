package com.yourtion.leetcode.daily.m05.d01;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200501")
class SolutionTest {

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void mergeTwoListsBase(String l1, String l2, String res) {
        System.out.printf("runTest: %s and %s, res: %s", l1, l2, res);
        ListNode ln1 = TestUtils.stringToListNode(l1);
        ListNode ln2 = TestUtils.stringToListNode(l2);
        String ret = TestUtils.listNodeToString(new Solution().mergeTwoLists(ln1, ln2));
        assertEquals(res, ret);
    }

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1, 2, 4]", "[1, 3, 4]", "[1, 1, 2, 3, 4, 4]"),
                arguments("[]", "[]", "[]"),
                arguments("[1, 2, 4]", "[]", "[1, 2, 4]"),
                arguments("[]", "[1, 3, 4]", "[1, 3, 4]"),
                arguments("[1, 2, 4]", "[4]", "[1, 2, 4, 4]"),
                arguments("[4]", "[1, 3, 4]", "[1, 3, 4, 4]"),
                arguments("[1, 2, 4]", "[1, 3, 4, 5, 5, 6]", "[1, 1, 2, 3, 4, 4, 5, 5, 6]"),
                arguments("[2]", "[1]", "[1, 2]")
        );
    }
}