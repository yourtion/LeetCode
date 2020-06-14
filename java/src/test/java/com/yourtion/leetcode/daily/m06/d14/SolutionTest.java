package com.yourtion.leetcode.daily.m06.d14;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200614")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[4,9,3]", 10, 3),
                arguments("[2,3,5]", 10, 5),
                arguments("[60864,25176,27249,21296,20204]", 56803, 11361)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findBestValue(String source, int target, int res) {
        System.out.printf("runTest: %s %d , res: %d", source, target, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().findBestValue(ss, target));
    }
}