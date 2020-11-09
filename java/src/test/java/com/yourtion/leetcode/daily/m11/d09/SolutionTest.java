package com.yourtion.leetcode.daily.m11.d09;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201109")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[1,3],[-2,2]]", 1, "[[-2, 2]]"),
                arguments("[[3,3],[5,-1],[-2,4]]", 2, "[[3, 3], [-2, 4]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void kClosest(String source, int k, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, k, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        int[][] ret = new Solution().kClosest(ss, k);
        Assertions.assertEquals(res, Arrays.deepToString(ret));
    }
}