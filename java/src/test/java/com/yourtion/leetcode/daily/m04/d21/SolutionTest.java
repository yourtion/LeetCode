package com.yourtion.leetcode.daily.m04.d21;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200421")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,1,2,1,1]", 3, 2),
                arguments("[2,4,6]", 1, 0),
                arguments("[2,2,2,1,2,2,1,2,2,2]", 2, 16)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void numberOfSubarrays(String source, int k, int res) {
        System.out.printf("runTest: %s , res: %d ", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().numberOfSubarrays(ss, k));
    }
}