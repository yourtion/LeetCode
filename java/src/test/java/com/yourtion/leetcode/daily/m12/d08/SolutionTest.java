package com.yourtion.leetcode.daily.m12.d08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201208")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("123456579", "[123, 456, 579]"),
                arguments("11235813", "[1, 1, 2, 3, 5, 8, 13]"),
                arguments("112358130", "[]"),
                arguments("0123", "[]"),
                arguments("1101111", "[11, 0, 11, 11]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void splitIntoFibonacci(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        List<Integer> ret = new Solution().splitIntoFibonacci(source);
        Assertions.assertEquals(res, ret.toString());
    }
}