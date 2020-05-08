package com.yourtion.leetcode.daily.m05.d08;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200508")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[\"1\",\"0\",\"1\",\"0\",\"0\"],[\"1\",\"0\",\"1\",\"1\",\"1\"],[\"1\",\"1\",\"1\",\"1\",\"1\"],[\"1\",\"0\",\"0\",\"1\",\"0\"]]", 4)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void maximalSquare(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        char[][] cs = TestUtils.stringToChar2dArray(source);
        Assertions.assertEquals(res, new Solution().maximalSquare(cs));
    }
}