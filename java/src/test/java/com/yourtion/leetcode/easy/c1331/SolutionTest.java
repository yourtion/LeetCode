package com.yourtion.leetcode.easy.c1331;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1331. 数组序号转换")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[40,10,20,30]", "[4, 1, 2, 3]"),
                arguments("[100,100,100]", "[1, 1, 1]"),
                arguments("[37,12,28,9,100,56,80,5,12]", "[5, 3, 4, 2, 8, 6, 7, 1, 3]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void arrayRankTransform(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().arrayRankTransform(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}