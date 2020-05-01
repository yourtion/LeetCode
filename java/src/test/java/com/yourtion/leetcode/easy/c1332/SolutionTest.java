package com.yourtion.leetcode.easy.c1332;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1332. 删除回文子序列")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("ababa", 1),
                arguments("abb", 2),
                arguments("baabb", 2),
                arguments("", 0)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void removePalindromeSub(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        Assertions.assertEquals(res, new Solution().removePalindromeSub(source));
    }
}