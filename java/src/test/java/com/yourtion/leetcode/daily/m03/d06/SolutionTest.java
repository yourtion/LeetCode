package com.yourtion.leetcode.daily.m03.d06;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200306")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(9, "[[2, 3, 4],[4, 5]]"),
                arguments(15, "[[1, 2, 3, 4, 5],[4, 5, 6],[7, 8]]"));
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findContinuousSequence(int source, String res) {
        System.out.printf("runTest: %d , res: %s ", source, res);
        String ret = TestUtils.int2dArrayToString(new Solution().findContinuousSequence(source));
        Assertions.assertEquals(res, ret);
    }
}