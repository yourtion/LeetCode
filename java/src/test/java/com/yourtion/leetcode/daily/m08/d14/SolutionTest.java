package com.yourtion.leetcode.daily.m08.d14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200814")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("", true),
                arguments("()[]{}", true),
                arguments("(]", false),
                arguments("([)]", false),
                arguments("{[]}", true),
                arguments("(])", false),
                arguments("]", false),
                arguments("}}", false),
                arguments("]]]", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isValid(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        Assertions.assertEquals(res, new Solution().isValid(source));
    }
}