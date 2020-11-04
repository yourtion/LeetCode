package com.yourtion.leetcode.daily.m11.d04;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201104")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[1,3],[6,9]]", "[2,5]", "[[1, 5],[6, 9]]"),
                arguments("[[1,2],[3,5],[6,7],[8,10],[12,16]]", "[4,8]", "[[1, 2],[3, 10],[12, 16]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void insert(String source, String ins, String res) {
        System.out.printf("runTest: %s %s , res: %s", source, ins, res);
        int[][] intervals = TestUtils.stringToInt2dArray(source);
        int[] newInterval = TestUtils.stringToIntegerArray(ins);
        int[][] ret = new Solution().insert(intervals, newInterval);
        Assertions.assertEquals(res, TestUtils.int2dArrayToString(ret));
    }
}