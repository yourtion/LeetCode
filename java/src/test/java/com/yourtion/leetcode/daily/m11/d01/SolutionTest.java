package com.yourtion.leetcode.daily.m11.d01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201101")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog"), "[cat sand dog, cats and dog]"),
                arguments("pineapplepenapple",
                        Arrays.asList("apple", "pen", "applepen", "pine", "pineapple"),
                        "[pine apple pen apple, pine applepen apple, pineapple pen apple]"
                ),
                arguments("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat"), "[]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void wordBreak(String source, List<String> wordDict, String res) {
        System.out.printf("runTest: %s %s, res: %s", source, wordDict, res);
        List<String> ret = new Solution().wordBreak(source, wordDict);
        Assertions.assertEquals(res, ret.toString());
    }
}