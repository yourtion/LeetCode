package com.yourtion.leetcode.daily.m04.d28;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200428")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[4,1,4,6]", "[6, 1]"),
                arguments("[1,2,10,4,1,4,3,3]", "[2, 10]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void singleNumbers(String source, String res) {
        System.out.printf("runTest: %s , res: %s ", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().singleNumbers(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}