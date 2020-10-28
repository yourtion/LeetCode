package com.yourtion.leetcode.daily.m10.d28;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201028")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,2,1,1,3]", true),
                arguments("[1,2]", false),
                arguments("[-3,0,1,-3,1,1,1,-3,10,0]", true)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void uniqueOccurrences(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().uniqueOccurrences(ss));
    }
}