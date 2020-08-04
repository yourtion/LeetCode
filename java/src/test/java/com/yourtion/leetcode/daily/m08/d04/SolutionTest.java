package com.yourtion.leetcode.daily.m08.d04;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200804")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[1,0]]", 2, true),
                arguments("[[1,0],[0,1]]", 2, false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void canFinish(String source, int num, boolean res) {
        System.out.printf("runTest: %s %d , res: %b", source, num, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().canFinish(num, ss));
    }
}