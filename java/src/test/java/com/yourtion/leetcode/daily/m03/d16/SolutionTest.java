package com.yourtion.leetcode.daily.m03.d16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200316")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("aabcccccaaa", "a2b1c5a3"),
                arguments("abbccd", "abbccd"),
                arguments("abbbbbbbbbbbb", "a1b12")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void compressString(String source, String res) {
        System.out.printf("runTest: %s , res: %s ", source, res);
        Assertions.assertEquals(res, new Solution().compressString(source));
    }
}