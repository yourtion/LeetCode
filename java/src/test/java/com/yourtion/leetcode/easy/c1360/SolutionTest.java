package com.yourtion.leetcode.easy.c1360;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1360. 日期之间隔几天")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("2019-06-29", "2019-06-30", 1),
                arguments("2020-01-15", "2019-12-31", 15),
                arguments("2008-03-21", "2041-05-08", 12101)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void daysBetweenDates(String d1, String d2, int res) {
        System.out.printf("runTest: %s %s , res: %b", d1, d2, res);
        Assertions.assertEquals(res, new Solution().daysBetweenDates(d1, d2));
    }
}