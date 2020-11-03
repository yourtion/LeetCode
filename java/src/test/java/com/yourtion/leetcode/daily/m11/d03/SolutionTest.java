package com.yourtion.leetcode.daily.m11.d03;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201103")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[2,1]", false),
                arguments("[3,5,5]", false),
                arguments("[0,3,2,1]", true),
                arguments("[0,3,2,1,2]", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void validMountainArray(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().validMountainArray(ss));
    }
}