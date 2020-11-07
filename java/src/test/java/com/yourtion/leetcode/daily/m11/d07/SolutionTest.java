package com.yourtion.leetcode.daily.m11.d07;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201107")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[-2,5,-1]", -2, 2, 3)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void countRangeSum(String source, int lower, int upper, int res) {
        System.out.printf("runTest: %s %d %d , res: %d", source, lower, upper, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().countRangeSum(ss, lower, upper));
    }
}