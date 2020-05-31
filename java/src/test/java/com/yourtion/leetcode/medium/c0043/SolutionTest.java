package com.yourtion.leetcode.medium.c0043;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("43. 字符串相乘")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("2", "3", "6"),
                arguments("123", "456", "56088")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void multiply(String n1, String n2, String res) {
        System.out.printf("runTest: %s %s , res: %s", n1, n2, res);
        Assertions.assertEquals(res, new Solution().multiply(n1, n2));
    }
}