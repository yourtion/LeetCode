package com.yourtion.leetcode.daily.m05.d06;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("983. 最低票价")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,4,6,7,8,20]", "[2,7,15]", 11),
                arguments("[1,2,3,4,5,6,7,8,9,10,30,31]", "[2,7,15]", 17)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void mincostTickets(String days, String costs, int res) {
        System.out.printf("runTest: %s %s , res: %d", days, costs, res);
        int[] ds = TestUtils.stringToIntegerArray(days);
        int[] cs = TestUtils.stringToIntegerArray(costs);
        Assertions.assertEquals(res, new Solution().mincostTickets(ds, cs));
    }
}