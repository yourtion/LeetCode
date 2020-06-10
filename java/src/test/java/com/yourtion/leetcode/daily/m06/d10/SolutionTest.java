package com.yourtion.leetcode.daily.m06.d10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200610")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(121, true),
                arguments(-121, false),
                arguments(10, false),
                arguments(12321, true)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isPalindrome(int source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        Assertions.assertEquals(res, new Solution().isPalindrome(source));
    }
}