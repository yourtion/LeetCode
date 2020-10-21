package com.yourtion.leetcode.daily.m10.d21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201021")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("alex", "aaleex", true),
                arguments("saeed", "ssaaedd", false),
                arguments("leelee", "lleeelee", true),
                arguments("laiden", "laiden", true),
                arguments("vtkgn", "vttkgnn", true),
                arguments("pyplrz", "ppyypllr", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isLongPressedName(String name, String typed, boolean res) {
        System.out.printf("runTest: %s %s , res: %b", name, typed, res);
        Assertions.assertEquals(res, new Solution().isLongPressedName(name, typed));
    }
}