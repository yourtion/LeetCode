package com.yourtion.leetcode.daily.m03.d17;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200317")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("cat,bt,hat,tree", "atach", 6),
                arguments("hello,world,leetcode", "welldonehoneyr", 10)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void countCharacters(String words, String chars, int res) {
        System.out.printf("runTest: %s %s, res: %d ", words, chars, res);
        String[] ss = TestUtils.stringToStringArray(words);
        Assertions.assertEquals(res, new Solution().countCharacters(ss, chars));
    }
}