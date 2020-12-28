package com.yourtion.leetcode.daily.m12.d28;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201228")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(2, "[2,4,1]", 2),
                arguments(2, "[3,2,6,5,0,3]", 7)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void maxProfit(int k, String source, int res) {
        System.out.printf("runTest: %d %s , res: %d", k, source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().maxProfit(k, ss));
    }
}