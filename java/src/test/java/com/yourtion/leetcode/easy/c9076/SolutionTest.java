package com.yourtion.leetcode.easy.c9076;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("LCP 17. 速算机器人")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("AB", 4)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void calculate(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        Assertions.assertEquals(res, new Solution().calculate(source));
    }
}