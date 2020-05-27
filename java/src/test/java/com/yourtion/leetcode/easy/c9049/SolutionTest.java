package com.yourtion.leetcode.easy.c9049;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题17. 打印从1到最大的n位数")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(1, "[1, 2, 3, 4, 5, 6, 7, 8, 9]"),
                arguments(2, "[1, 99]"),
                arguments(3, "[1, 999]")

        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void printNumbers(int source, String res) {
        System.out.printf("runTest: %d , res: %s", source, res);
        int[] ret = new Solution().printNumbers(source);

        if (source == 1) {
            Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
        } else {
            int[] nn = TestUtils.stringToIntegerArray(res);
            Assertions.assertEquals(nn[0], ret[0]);
            Assertions.assertEquals(nn[1], ret[ret.length - 1]);
        }
    }
}