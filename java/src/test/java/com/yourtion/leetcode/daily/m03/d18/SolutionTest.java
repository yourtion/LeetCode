package com.yourtion.leetcode.daily.m03.d18;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200318")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[0,0,2,2]", "[1,1,3,3]", true),
                arguments("[0,0,1,1]", "[1,0,2,1]", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isRectangleOverlap(String s1, String s2, boolean res) {
        System.out.printf("runTest: %s %s, res: %b ", s1, s2, res);
        int[] s1s = TestUtils.stringToIntegerArray(s1);
        int[] s2s = TestUtils.stringToIntegerArray(s2);
        Assertions.assertEquals(res, new Solution().isRectangleOverlap(s1s, s2s));
    }
}