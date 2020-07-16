package com.yourtion.leetcode.daily.m07.d16;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200716")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[1,3], [0,2], [1,3], [0,2]]", true),
                arguments("[[1,2,3], [0,2], [0,1,3], [0,2]]", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isBipartite(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().isBipartite(ss));
    }
}