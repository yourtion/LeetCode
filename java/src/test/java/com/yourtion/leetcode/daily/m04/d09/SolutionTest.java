package com.yourtion.leetcode.daily.m04.d09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200409")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(1, "[()]"),
                arguments(2, "[()(), (())]"),
                arguments(3, "[()()(), ()(()), (()()), (())(), ((()))]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void generateParenthesis(int source, String res) {
        System.out.printf("runTest: %d , res: %s ", source, res);
        List<String> ret = new Solution().generateParenthesis(source);
        Assertions.assertEquals(res, Arrays.toString(ret.toArray()));
    }
}