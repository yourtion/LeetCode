package com.yourtion.leetcode.daily.m11.d27;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201127")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1, 2]", "[-2,-1]", "[-1, 2]", "[0, 2]", 2)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void fourSumCount(String a, String b, String c, String d, int res) {
        System.out.printf("runTest: %s %s %s %s  , res: %d", a, b, c, d, res);
        int[] sa = TestUtils.stringToIntegerArray(a);
        int[] sb = TestUtils.stringToIntegerArray(b);
        int[] sc = TestUtils.stringToIntegerArray(c);
        int[] sd = TestUtils.stringToIntegerArray(d);
        Assertions.assertEquals(res, new Solution().fourSumCount(sa, sb, sc, sd));
    }
}