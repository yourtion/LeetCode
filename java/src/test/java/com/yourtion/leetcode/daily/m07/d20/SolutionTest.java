package com.yourtion.leetcode.daily.m07.d20;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200720")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[2, 7, 11, 15]", 9, "[1, 2]"),
                arguments("[-3, 0, 3, 4, 90]", 0, "[1, 3]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void twoSum(String source, int target, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, target, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().twoSum(ss, target);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}