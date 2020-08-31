package com.yourtion.leetcode.daily.m08.d31;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200830")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[1],[2],[3],[]]", true),
                arguments("[[1,3],[3,0,1],[2],[0]]", false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void canVisitAllRooms(String source, boolean res) {
        System.out.printf("runTest: %s , res: %b", source, res);
        List<List<Integer>> ss = TestUtils.stringToInteger2dArray(source);
        Assertions.assertEquals(res, new Solution().canVisitAllRooms(ss));
    }
}