package com.yourtion.leetcode.easy.c1399;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1399. 统计最大组的数目")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(13, 4),
                arguments(2, 2),
                arguments(15, 6),
                arguments(24, 5)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void countLargestGroup(int source, int res) {
        System.out.printf("runTest: %d , res: %d", source, res);
        Assertions.assertEquals(res, new Solution().countLargestGroup(source));
    }
}