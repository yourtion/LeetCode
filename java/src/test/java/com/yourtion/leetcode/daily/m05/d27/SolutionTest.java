package com.yourtion.leetcode.daily.m05.d27;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200527")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[4,5,0,-2,-3,1]", 5, 7)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void subarraysDivByK(String source, int k, int res) {
        System.out.printf("runTest: %s %d, res: %d", source, k, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().subarraysDivByK(ss, k));
    }
}