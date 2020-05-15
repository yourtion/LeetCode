package com.yourtion.leetcode.daily.m05.d15;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200515")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,1,1]", 2, 2),
                arguments("[28,54,7,-70,22,65,-6]", 100, 1),
                arguments("[0,0,0,0,0,0,0,0,0,0]", 0, 55)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void subarraySum(String source, int k, int res) {
        System.out.printf("runTest: %s %d , res: %d", source, k, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().subarraySum(ss, k));
    }
}