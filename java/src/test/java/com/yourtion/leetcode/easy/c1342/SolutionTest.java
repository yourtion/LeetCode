package com.yourtion.leetcode.easy.c1342;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1342. 将数字变成 0 的操作次数")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(14, 6),
                arguments(8, 4),
                arguments(123, 12)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void numberOfSteps(int source, int res) {
        System.out.printf("runTest: %d , res: %d", source, res);
        Assertions.assertEquals(res, new Solution().numberOfSteps(source));
    }
}