package com.yourtion.leetcode.easy.c9059;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题39. 数组中出现次数超过一半的数字")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1, 2, 3, 2, 2, 2, 5, 4, 2]", 2),
                arguments("[1,2,2]", 2)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void majorityElement(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().majorityElement(ss));
    }
}