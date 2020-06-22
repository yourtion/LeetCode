package com.yourtion.leetcode.daily.m06.d22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200622")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("abba", "dogcatcatdog", true),
                arguments("abba", "dogcatcatfish", false),
                arguments("aaaa", "dogcatcatdog", false),
                arguments("abba", "dogdogdogdog", true)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void patternMatching(String patten, String value, boolean res) {
        System.out.printf("runTest: %s %s , res: %b", patten, value, res);
        Assertions.assertEquals(res, new Solution().patternMatching(patten, value));
    }
}