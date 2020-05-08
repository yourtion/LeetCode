package com.yourtion.leetcode.easy.c1440;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("LCP 01. 猜数字")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3]", "[1,2,3]", 3),
                arguments("[2,2,3]", "[3,2,1]", 1)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void game(String s1, String s2, int res) {
        System.out.printf("runTest: %s %s , res: %d", s1, s2, res);
        int[] ss1 = TestUtils.stringToIntegerArray(s1);
        int[] ss2 = TestUtils.stringToIntegerArray(s2);
        Assertions.assertEquals(res, new Solution().game(ss1, ss2));
    }
}