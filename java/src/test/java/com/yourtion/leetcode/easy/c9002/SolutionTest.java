package com.yourtion.leetcode.easy.c9002;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("LCP 02. 分式化简")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[3, 2, 0, 2]", "[13, 4]"),
                arguments("[0, 0, 3]", "[3, 1]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void fraction(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().fraction(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}