package com.yourtion.leetcode.daily.m10.d02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201002")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("aA", "aAAbbbb", 3),
                arguments("z", "ZZ", 0)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void numJewelsInStones(String j, String s, int res) {
        System.out.printf("runTest: %s %s , res: %d", j, s, res);
        Assertions.assertEquals(res, new Solution().numJewelsInStones(j, s));
    }
}