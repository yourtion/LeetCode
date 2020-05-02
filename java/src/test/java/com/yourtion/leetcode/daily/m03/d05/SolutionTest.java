package com.yourtion.leetcode.daily.m03.d05;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200305")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(7, 4, "[1, 2, 3, 1]"),
                arguments(10, 3, "[5, 2, 3]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void distributeCandies(int c, int p, String res) {
        System.out.printf("runTest: %d %d , res: %s ", c, p, res);
        String ret = TestUtils.integerArrayToString(new Solution().distributeCandies(c, p));
        Assertions.assertEquals(res, ret);
    }
}