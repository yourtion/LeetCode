package com.yourtion.leetcode.daily.m10.d23;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201023")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1, 2]", false),
                arguments("[1,2,2,1]", true),
                arguments("[1,1]", true),
                arguments("[1,2,1]", true),
                arguments("[]", true),
                arguments("[1,2,3,3,1]", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isPalindrome(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        ListNode n = TestUtils.stringToListNode(source);
        Assertions.assertEquals(res, new Solution().isPalindrome(n));
    }
}