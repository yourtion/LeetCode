package com.yourtion.leetcode.daily.m10.d25;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201025")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[2,1,4,7,3,2,5]", 5),
                arguments("[2,2,2]", 0)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void longestMountain(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().longestMountain(ss));
    }
}