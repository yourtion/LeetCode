package com.yourtion.leetcode.daily.m06.d20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200620")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("aa", "a", false),
                arguments("aa", "a*", true),
                arguments("ab", ".*", true),
                arguments("aab", "c*a*b", true),
                arguments("mississippi", "mis*is*p*.", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isMatch(String s, String p, boolean res) {
        System.out.printf("runTest: %s %s , res: %b", s, p, res);
        Assertions.assertEquals(res, new Solution().isMatch(s, p));
    }
}