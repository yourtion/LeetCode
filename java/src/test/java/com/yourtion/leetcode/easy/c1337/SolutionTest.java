package com.yourtion.leetcode.easy.c1337;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1337. 方阵中战斗力最弱的 K 行")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[1,1,0,0,0],[1,1,1,1,0],[1,0,0,0,0],[1,1,0,0,0],[1,1,1,1,1]]", 3, "[2, 0, 3]"),
                arguments("[[1,0,0,0],[1,1,1,1], [1,0,0,0],[1,0,0,0]]", 2, "[0, 2]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void kWeakestRows(String source, int k, String res) {
        System.out.printf("runTest: %s %d, res: %s", source, k, res);
        int[][] ss = TestUtils.stringToInt2dArray(source);
        int[] ret = new Solution().kWeakestRows(ss, k);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}