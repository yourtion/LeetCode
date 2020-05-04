package com.yourtion.leetcode.easy.c1380;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1380. 矩阵中的幸运数")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[3,7,8],[9,11,13],[15,16,17]]", "[15]"),
                arguments("[[1,10,4,2],[9,3,8,7],[15,16,17,12]]", "[12]"),
                arguments("[[7,8],[1,2]]", "[7]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void luckyNumbers(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[][] m = TestUtils.stringToInt2dArray(source);
        List<Integer> ret = new Solution().luckyNumbers(m);
        Assertions.assertEquals(res, TestUtils.integerArrayListToString(ret));
    }
}