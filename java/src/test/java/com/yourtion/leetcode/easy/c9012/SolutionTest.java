package com.yourtion.leetcode.easy.c9012;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 02.06. 回文链表")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2]", false),
                arguments("[1,2,3,2,1]", true)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isPalindrome(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        ListNode head = TestUtils.stringToListNode(source);
        Assertions.assertEquals(res, new Solution().isPalindrome(head));
    }
}