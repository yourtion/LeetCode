package com.yourtion.leetcode.easy.c9061;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题50. 第一个只出现一次的字符")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("abaccdeff", 'b'),
                arguments("", ' '),
                arguments("leetcode", 'l')
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void firstUniqChar(String source, char res) {
        System.out.printf("runTest: %s , res: %c", source, res);
        Assertions.assertEquals(res, new Solution().firstUniqChar(source));
    }
}