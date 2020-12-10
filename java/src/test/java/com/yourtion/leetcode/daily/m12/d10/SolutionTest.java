package com.yourtion.leetcode.daily.m12.d10;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201210")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[5,5,5,10,20]", true),
                arguments("[5,5,10]", true),
                arguments("[10,10]", false),
                arguments("[5,5,10,10,20]", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void lemonadeChange(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().lemonadeChange(ss));
    }
}