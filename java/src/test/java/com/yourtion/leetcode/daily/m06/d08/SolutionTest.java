package com.yourtion.leetcode.daily.m06.d08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200607")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(new String[]{"a==b", "b!=c", "c==a"}, false),
                arguments(new String[]{"c==c", "b==d", "x!=z"}, true),
                arguments(new String[]{"a!=a"}, false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void equationsPossible(String[] source, boolean res) {
        System.out.printf("runTest: %s , res: %b", Arrays.toString(source), res);
        Assertions.assertEquals(res, new Solution().equationsPossible(source));
    }
}