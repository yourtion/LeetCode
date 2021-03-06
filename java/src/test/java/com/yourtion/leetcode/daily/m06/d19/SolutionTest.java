package com.yourtion.leetcode.daily.m06.d19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200619")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("A man, a plan, a canal: Panama", true),
                arguments("race a car", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isPalindrome(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        Assertions.assertEquals(res, new Solution().isPalindrome(source));
    }
}