package com.yourtion.leetcode.daily.m03.d08;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200308")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1, 2, 5]", 11, 3),
                arguments("[2]", 3, -1)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void coinChange(String source, int num, int res) {
        System.out.printf("runTest: %s %d, res: %d ", source, num, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().coinChange(ss, num));
    }
}