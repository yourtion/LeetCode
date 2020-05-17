package com.yourtion.leetcode.easy.c9023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 05.07. 配对交换")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(2, 1),
                arguments(3, 3)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void exchangeBits(int source, int res) {
        System.out.printf("runTest: %d , res: %d", source, res);
        Assertions.assertEquals(res, new Solution().exchangeBits(source));
    }
}