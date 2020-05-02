package com.yourtion.leetcode.daily.m04.d04;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200404")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[0,1,0,2,1,0,1,3,2,1,2,1]", 6),
                arguments("[0,1,0,2,1,0,1,3,2,1,2,3]", 9)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void trap(String source, int res) {
        System.out.printf("runTest: %s , res: %d ", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().trap(ss));
    }
}