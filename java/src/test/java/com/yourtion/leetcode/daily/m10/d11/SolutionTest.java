package com.yourtion.leetcode.daily.m10.d11;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201011")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1, 5, 11, 5]", true),
                arguments("[1, 2, 3, 5]", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void canPartition(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().canPartition(ss));
    }
}