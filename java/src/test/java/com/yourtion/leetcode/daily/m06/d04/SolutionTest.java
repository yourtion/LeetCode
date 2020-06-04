package com.yourtion.leetcode.daily.m06.d04;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200604")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,4]", "[24, 12, 8, 6]"),
                arguments("[1,2,0,4]", "[0, 0, 8, 0]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void productExceptSelf(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().productExceptSelf(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}