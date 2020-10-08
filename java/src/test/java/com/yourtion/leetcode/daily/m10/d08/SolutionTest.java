package com.yourtion.leetcode.daily.m10.d08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201008")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("hello", "olleh"),
                arguments("Hannah", "hannaH")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void reverseString(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        char[] ss = source.toCharArray();
        new Solution().reverseString(ss);
        Assertions.assertEquals(res, new String(ss));
    }
}