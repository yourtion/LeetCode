package com.yourtion.leetcode.daily.m11.d15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201115")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("1432219", 3, "1219"),
                arguments("10200", 1, "200"),
                arguments("10", 2, "0")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void removeKdigits(String source, int k, String res) {
        System.out.printf("runTest: %s %d, res: %s", source, k, res);
        Assertions.assertEquals(res, new Solution().removeKdigits(source, k));
    }
}