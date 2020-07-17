package com.yourtion.leetcode.daily.m07.d17;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200717")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,3,5,6]", 5, 2),
                arguments("[1,3,5,6]", 2, 1),
                arguments("[1,3,5,6]", 7, 4),
                arguments("[1,3,5,6]", 0, 0)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void searchInsert(String source, int target, int res) {
        System.out.printf("runTest: %s %d , res: %d", source, target, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().searchInsert(ss, target));
    }
}