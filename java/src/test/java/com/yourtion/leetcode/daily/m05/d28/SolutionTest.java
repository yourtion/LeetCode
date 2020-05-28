package com.yourtion.leetcode.daily.m05.d28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200528")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("3[a]2[bc]", "aaabcbc"),
                arguments("3[a2[c]]", "accaccacc"),
                arguments("2[abc]3[cd]ef", "abcabccdcdcdef")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void decodeString(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        Assertions.assertEquals(res, new Solution().decodeString(source));
    }
}