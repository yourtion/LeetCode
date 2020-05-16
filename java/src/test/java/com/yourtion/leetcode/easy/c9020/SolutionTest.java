package com.yourtion.leetcode.easy.c9020;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 05.01. 插入")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(1024, 19, 2, 6, 1100),
                arguments(0, 31, 0, 4, 31),
                arguments(1143207437, 1017033, 11, 31, 2082885133)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void insertBits(int N, int M, int i, int j, int res) {
        System.out.printf("runTest: %s %s %d %d, res: %d", Integer.toBinaryString(N), Integer.toBinaryString(M), i, j, res);
        Assertions.assertEquals(res, new Solution().insertBits(N, M, i, j));
    }
}