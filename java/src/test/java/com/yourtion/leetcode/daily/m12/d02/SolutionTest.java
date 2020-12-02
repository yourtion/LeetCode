package com.yourtion.leetcode.daily.m12.d02;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201202")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[3, 4, 6, 5]", "[9, 1, 2, 5, 8, 3]", 5, "[9, 8, 6, 5, 3]"),
                arguments("[6, 7]", "[6, 0, 4]", 5, "[6, 7, 6, 0, 4]"),
                arguments("[3, 9]", " [8, 9]", 3, "[9, 8, 9]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void maxNumber(String n1, String n2, int k, String res) {
        System.out.printf("runTest: %s %s %d , res: %s", n1, n2, k, res);
        int[] num1 = TestUtils.stringToIntegerArray(n1);
        int[] num2 = TestUtils.stringToIntegerArray(n2);
        int[] ret = new Solution().maxNumber(num1, num2, k);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}