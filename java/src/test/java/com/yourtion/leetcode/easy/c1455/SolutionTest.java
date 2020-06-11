package com.yourtion.leetcode.easy.c1455;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1455. 检查单词是否为句中其他单词的前缀")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("i love eating burger", "burg", 4),
                arguments("this problem is an easy problem", "pro", 2),
                arguments("i am tired", "you", -1),
                arguments("i use triple pillow", "pill", 4),
                arguments("hello from the other side", "they", -1)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void isPrefixOfWord(String source, String word, int res) {
        System.out.printf("runTest: %s %s , res: %d", source, word, res);
        Assertions.assertEquals(res, new Solution().isPrefixOfWord(source, word));
    }
}