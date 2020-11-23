package com.yourtion.leetcode.daily.m11.d23;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201123")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[10,16],[2,8],[1,6],[7,12]]", 2),
                arguments("[[1,2],[3,4],[5,6],[7,8]]", 4),
                arguments("[[1,2],[2,3],[3,4],[4,5]]", 2),
                arguments("[[1,2]]", 1),
                arguments("[[1,2]]", 1)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findMinArrowShots(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().findMinArrowShots(ss));
    }
}