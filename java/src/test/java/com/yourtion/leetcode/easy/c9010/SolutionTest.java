package com.yourtion.leetcode.easy.c9010;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 01.09. 字符串轮转")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("waterbottle", "erbottlewat", true),
                arguments("aa", "aba", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isFlipedString(String s1, String s2, boolean res) {
        System.out.printf("runTest: %s %s , res: %b", s1, s2, res);
        Assertions.assertEquals(res, new Solution().isFlipedString(s1, s2));
    }
}