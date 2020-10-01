package com.yourtion.leetcode.daily.m10.d01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201001")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("rrryyyrryyyrr", 2),
                arguments("ryr", 0)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void minimumOperations(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        Assertions.assertEquals(res, new Solution().minimumOperations(source));
    }
}