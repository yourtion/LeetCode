package com.yourtion.leetcode.daily.m07.d01;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200701")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,2,1]", "[3,2,1,4,7]", 3)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findLength(String a, String b, int res) {
        System.out.printf("runTest: %s %s , res: %d", a, b, res);
        int[] sa = TestUtils.stringToIntegerArray(a);
        int[] sb = TestUtils.stringToIntegerArray(b);
        Assertions.assertEquals(res, new Solution().findLength(sa, sb));
    }
}