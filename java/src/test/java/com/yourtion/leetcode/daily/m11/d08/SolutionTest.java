package com.yourtion.leetcode.daily.m11.d08;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201108")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[7,1,5,3,6,4]", 7),
                arguments("[1,2,3,4,5]", 4),
                arguments("[7,6,4,3,1]", 0)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void maxProfit(String source, int res) {
        System.out.printf("runTest: %s , res: %d ", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().maxProfit(ss));
    }
}