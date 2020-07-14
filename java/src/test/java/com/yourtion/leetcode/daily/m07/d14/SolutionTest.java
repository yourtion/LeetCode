package com.yourtion.leetcode.daily.m07.d14;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200714")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[2],[3,4],[6,5,7],[4,1,8,3]]", 11)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void minimumTotal(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        List<List<Integer>> ss = TestUtils.stringToInteger2dArray(source);
        Assertions.assertEquals(res, new Solution().minimumTotal(ss));
    }
}