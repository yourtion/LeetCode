package com.yourtion.leetcode.easy.c9070;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 58 - II. 左旋转字符串")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("abcdefg", 2, "cdefgab"),
                arguments("lrloseumgh", 6, "umghlrlose")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void reverseLeftWords(String source, int k, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, k, res);
        Assertions.assertEquals(res, new Solution().reverseLeftWords(source, k));
    }
}