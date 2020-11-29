package com.yourtion.leetcode.daily.m11.d29;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201129")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[2,1,2]", 5),
                arguments("[1,2,1]", 0),
                arguments("[3,2,3,4]", 10),
                arguments("[3,6,2,3]", 8)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void largestPerimeter(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().largestPerimeter(ss));
    }
}