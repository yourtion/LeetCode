package com.yourtion.leetcode.daily.m04.d19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200419")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("acb", 4, "ab", 2, 2),
                arguments("acbd", 5, "abc", 3, 0)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void getMaxRepetitions(String s1, int n1, String s2, int n2, int res) {
        System.out.printf("runTest: %s %d , %s, %d, res: %d ", s1, n1, s2, n2, res);
        Assertions.assertEquals(res, new Solution().getMaxRepetitions(s1, n1, s2, n2));
    }
}