package com.yourtion.leetcode.daily.m06.d07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200607")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"),
                        "[[hit, hot, dot, dog, cog], [hit, hot, lot, log, cog]]"),
                arguments("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log"), "[]")

        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findLadders(String beginWord, String endWord, List<String> wordList, String res) {
        System.out.printf("runTest: %s %s %s , res: %s", beginWord, endWord, wordList.toString(), res);
        List<List<String>> ret = new Solution().findLadders(beginWord, endWord, wordList);
        Assertions.assertEquals(res, ret.toString());
    }
}