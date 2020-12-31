package com.yourtion.leetcode.easy.c9077;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("LCP 18. 早餐组合")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[10,20,5]", "[5,5,2]", 15, 6),
                arguments("[2,1,1]", "[8,9,5,1]", 9, 8)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void breakfastNumber(String s1, String s2, int x, int res) {
        System.out.printf("runTest: %s %s %d , res: %d", s1, s2, x, res);
        int[] staple = TestUtils.stringToIntegerArray(s1);
        int[] drinks = TestUtils.stringToIntegerArray(s2);
        Assertions.assertEquals(res, new Solution().breakfastNumber(staple, drinks, x));
    }
}