package com.yourtion.leetcode.daily.m06.d15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200615")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(new String[]{"flower", "flow", "flight"}, "fl"),
                arguments(new String[]{"dog", "racecar", "car"}, "")

        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void longestCommonPrefix(String[] source, String res) {
        System.out.printf("runTest: %s , res: %s", Arrays.toString(source), res);
        Assertions.assertEquals(res, new Solution().longestCommonPrefix(source));
    }
}