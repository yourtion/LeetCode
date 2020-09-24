package com.yourtion.leetcode.daily.m06.d25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200625")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("leetcode", Arrays.asList("leet", "code"), true),
                arguments("applepenapple", Arrays.asList("apple", "pen"), true),
                arguments("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat"), false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void wordBreak(String s, List<String> w, boolean res) {
        System.out.printf("runTest: %s %s, res: %b", s, w, res);
        Assertions.assertEquals(res, new Solution().wordBreak(s, w));
    }
}