package com.yourtion.leetcode.daily.m07.d09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200709")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(new String[]{"looked", "just", "like", "her", "brother"}, "jesslookedjustliketimherbrother", 7)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void respace(String[] dic, String source, int res) {
        System.out.printf("runTest: %s %s , res: %d", Arrays.toString(dic), source, res);
        Assertions.assertEquals(res, new Solution().respace(dic, source));
    }
}