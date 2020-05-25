package com.yourtion.leetcode.medium.c0012;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("12. 整数转罗马数字")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(3, "III"),
                arguments(4, "IV"),
                arguments(9, "IX"),
                arguments(58, "LVIII"),
                arguments(1994, "MCMXCIV")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void intToRoman(int source, String res) {
        System.out.printf("runTest: %d , res: %s", source, res);
        Assertions.assertEquals(res, new Solution().intToRoman(source));
    }
}