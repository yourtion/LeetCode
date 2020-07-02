package com.yourtion.leetcode.daily.m07.d02;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200702")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[ 1,  5,  9], [10, 11, 13],[12, 13, 15]]", 8, 13)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void kthSmallest(String source, int k, int res) {
        System.out.printf("runTest: %s %d , res: %d", source, k, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().kthSmallest(ss, k));
    }
}