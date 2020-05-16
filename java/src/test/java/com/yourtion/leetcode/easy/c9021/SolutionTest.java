package com.yourtion.leetcode.easy.c9021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 05.03. 翻转数位")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(1775, 8),
                arguments(7, 4)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void reverseBits(int source, int res) {
        System.out.printf("runTest: %d , res: %d", source, res);
        Assertions.assertEquals(res, new Solution().reverseBits(source));
    }
}