package com.yourtion.leetcode.daily.m07.d24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200724")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(2, true),
                arguments(3, false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void divisorGame(int source, boolean res) {
        System.out.printf("runTest: %d , res: %b", source, res);
        Assertions.assertEquals(res, new Solution().divisorGame(source));
    }
}