package com.yourtion.leetcode.easy.c1464;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1464. 数组中两元素的最大乘积")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[3,4,5,2]", 12),
                arguments("[1,5,4,5]", 16),
                arguments("[3,7]", 12)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void maxProduct(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().maxProduct(ss));
    }
}