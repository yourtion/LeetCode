package com.yourtion.leetcode.daily.m04.d27;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200427")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[4,5,6,7,0,1,2]", 0, 4),
                arguments("[4,5,6,7,0,1,2]", 3, -1)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void search(String source, int target, int res) {
        System.out.printf("runTest: %s %d , res: %d ", source, target, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().search(ss, target));
    }
}