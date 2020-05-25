package com.yourtion.leetcode.medium.c0002;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("2. 两数相加")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[2,4,3]", "[5,6,4]", "[7, 0, 8]"),
                arguments("[2,4,3]", "[7]", "[9, 4, 3]"),
                arguments("[5]", "[5]", "[0, 1]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void addTwoNumbers(String l1, String l2, String res) {
        System.out.printf("runTest: %s %s , res: %s", l1, l2, res);
        ListNode l1l = TestUtils.stringToListNode(l1);
        ListNode l2l = TestUtils.stringToListNode(l2);
        ListNode ret = new Solution().addTwoNumbers(l1l, l2l);
        Assertions.assertEquals(res, TestUtils.listNodeToString(ret));
    }
}