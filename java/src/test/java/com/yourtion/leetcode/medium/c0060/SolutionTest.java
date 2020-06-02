package com.yourtion.leetcode.medium.c0060;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("60. 第k个排列")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(3, 3, "213"),
                arguments(4, 9, "2314")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void getPermutation(int n, int k, String res) {
        System.out.printf("runTest: %d %d , res: %s", n, k, res);
        Assertions.assertEquals(res, new Solution().getPermutation(n, k));
    }
}