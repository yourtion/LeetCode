package com.yourtion.leetcode.daily.m11.d06;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201106")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[0,1,2,3,4,5,6,7,8]", "[0, 1, 2, 4, 8, 3, 5, 6, 7]"),
                arguments("[1024,512,256,128,64,32,16,8,4,2,1]", "[1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024]"),
                arguments("[10000,10000]", "[10000, 10000]"),
                arguments("[2,3,5,7,11,13,17,19]", "[2, 3, 5, 17, 7, 11, 13, 19]"),
                arguments("[10,100,1000,10000]", "[10, 100, 10000, 1000]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void sortByBits(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().sortByBits(ss);
        Assertions.assertEquals(res, Arrays.toString(ret));
    }
}