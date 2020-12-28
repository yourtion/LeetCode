package com.yourtion.leetcode.easy.c9071;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 59 - I. 滑动窗口的最大值")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,3,-1,-3,5,3,6,7]", 3, "[3, 3, 5, 5, 6, 7]"),
                arguments("[1,3,-1,-3,5,3,6,7]", 1, "[1, 3, -1, -3, 5, 3, 6, 7]"),
                arguments("[]", 0, "[]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void maxSlidingWindow(String source, int k, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, k, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().maxSlidingWindow(ss, k);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}