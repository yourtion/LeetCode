package com.yourtion.leetcode.easy.c1389;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1389. 按既定顺序创建目标数组")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[0,1,2,3,4]", "[0,1,2,2,1]", "[0, 4, 1, 3, 2]"),
                arguments("[1,2,3,4,0]", "[0,1,2,3,0]", "[0, 1, 2, 3, 4]"),
                arguments("[1]", "[0]", "[1]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void createTargetArray(String n, String i, String res) {
        System.out.printf("runTest: %s %s , res: %s", n, i, res);
        int[] nums = TestUtils.stringToIntegerArray(n);
        int[] index = TestUtils.stringToIntegerArray(i);
        int[] ret = new Solution().createTargetArray(nums, index);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}