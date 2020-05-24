package com.yourtion.leetcode.easy.c9046;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题10-II. 青蛙跳台阶问题")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(2, 2),
                arguments(7, 21),
                arguments(0, 1)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void numWays(int source, int res) {
        System.out.printf("runTest: %d , res: %d", source, res);
        Assertions.assertEquals(res, new Solution().numWays(source));
    }
}