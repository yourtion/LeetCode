package com.yourtion.leetcode.daily.m11.d18;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201118")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,4,5]", "[3, 4, 5, 1, 2]", 3)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void canCompleteCircuit(String source1, String source2, int res) {
        System.out.printf("runTest: %s %s , res: %d", source1, source2, res);
        int[] gas = TestUtils.stringToIntegerArray(source1);
        int[] cost = TestUtils.stringToIntegerArray(source2);
        Assertions.assertEquals(res, new Solution().canCompleteCircuit(gas, cost));
    }
}