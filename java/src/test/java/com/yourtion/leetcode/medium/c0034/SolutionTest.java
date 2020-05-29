package com.yourtion.leetcode.medium.c0034;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("34. 在排序数组中查找元素的第一个和最后一个位置")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[5,7,7,8,8,10]", 8, "[3, 4]"),
                arguments("[5,7,7,8,8,10]", 6, "[-1, -1]"),
                arguments("[1]", 1, "[0, 0]"),
                arguments("[2,2]", 2, "[0, 1]"),
                arguments("[1,3]", 1, "[0, 0]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void searchRange(String source, int target, String res) {
        System.out.printf("runTest: %s %d , res: %s", source, target, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().searchRange(ss, target);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}