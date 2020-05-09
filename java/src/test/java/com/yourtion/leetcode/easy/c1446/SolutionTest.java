package com.yourtion.leetcode.easy.c1446;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("LCP 07. 传递信息")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(5, "[[0,2],[2,1],[3,4],[2,3],[1,4],[2,0],[0,4]]", 3, 3),
                arguments(3, "[[0,2],[2,1]]", 2, 0),
                arguments(3, "[[0,1],[0,2],[2,1],[1,2],[1,0],[2,0]]", 5, 11)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void numWays(int n, String r, int k, int res) {
        System.out.printf("runTest: %d %s %d , res: %d", n, r, k, res);
        int[][] ss = TestUtils.stringToInt2dArray(r);
        Assertions.assertEquals(res, new Solution().numWays(n, ss, k));
    }
}