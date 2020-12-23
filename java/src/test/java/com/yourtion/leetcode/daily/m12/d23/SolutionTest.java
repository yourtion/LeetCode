package com.yourtion.leetcode.daily.m12.d23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201222")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("leetcode", 0),
                arguments("loveleetcode", 2),
                arguments("leel", -1)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void firstUniqChar(String source, int res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        Assertions.assertEquals(res, new Solution().firstUniqChar(source));
    }
}