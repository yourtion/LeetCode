package com.yourtion.leetcode.easy.c1457;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 01.02. 判定是否互为字符重排")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("abc", "bca", true),
                arguments("abc", "bad", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void checkPermutation(String s1, String s2, boolean res) {
        System.out.printf("runTest: %s %s , res: %b", s1, s2, res);
        Assertions.assertEquals(res, new Solution().CheckPermutation(s1, s2));
    }
}