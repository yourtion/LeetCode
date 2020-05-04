package com.yourtion.leetcode.easy.c1374;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1374. 生成每种字符都是奇数个的字符串")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(4, "baaa"),
                arguments(2, "ba"),
                arguments(7, "aaaaaaa")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void generateTheString(int source, String res) {
        System.out.printf("runTest: %d , res: %s", source, res);
        Assertions.assertEquals(res, new Solution().generateTheString(source));
    }
}