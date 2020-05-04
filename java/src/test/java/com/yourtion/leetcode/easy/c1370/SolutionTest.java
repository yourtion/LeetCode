package com.yourtion.leetcode.easy.c1370;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1370. 上升下降字符串")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("aaaabbbbcccc", "abccbaabccba"),
                arguments("rat", "art"),
                arguments("leetcode", "cdelotee"),
                arguments("ggggggg", "ggggggg"),
                arguments("spo", "ops")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void sortString(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        Assertions.assertEquals(res, new Solution().sortString(source));
    }
}