package com.yourtion.leetcode.daily.m10.d24;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201024")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[0,2],[4,6],[8,10],[1,9],[1,5],[5,9]]", 10, 3),
                arguments("[[0,1],[1,2]]", 5, -1),
                arguments("[[0,1],[6,8],[0,2],[5,6],[0,4],[0,3],[6,7],[1,3],[4,7],[1,4],[2,5],[2,6],[3,4],[4,5],[5,7],[6,9]]", 9, 3),
                arguments("[[0,4],[2,8]]", 5, 2)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void videoStitching(String source, int v, int res) {
        System.out.printf("runTest: %s  %d, res: %d", source, v, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        Assertions.assertEquals(res, new Solution().videoStitching(ss, v));
    }
}