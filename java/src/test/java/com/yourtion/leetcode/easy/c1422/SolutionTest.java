package com.yourtion.leetcode.easy.c1422;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1422. 分割字符串的最大得分")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("011101", 5),
                arguments("00111", 5),
                arguments("1111", 3),
                arguments("00", 1)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void maxScore(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        Assertions.assertEquals(res, new Solution().maxScore(source));
    }
}