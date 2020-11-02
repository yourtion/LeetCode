package com.yourtion.leetcode.daily.m11.d02;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201102")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,2,1]", "[2,2]", "[2]"),
                arguments("[4,9,5]", "[9,4,9,8,4]", "[4, 9]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void intersection(String n1, String n2, String res) {
        System.out.printf("runTest: %s %s , res: %s", n1, n2, res);
        int[] num1 = TestUtils.stringToIntegerArray(n1);
        int[] num2 = TestUtils.stringToIntegerArray(n2);
        int[] ret = new Solution().intersection(num1, num2);
        Assertions.assertEquals(res, Arrays.toString(ret));
    }
}