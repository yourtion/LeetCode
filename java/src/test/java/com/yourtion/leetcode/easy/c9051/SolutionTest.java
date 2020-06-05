package com.yourtion.leetcode.easy.c9051;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题21. 调整数组顺序使奇数位于偶数前面")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,4]", "[1, 3, 2, 4]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void exchange(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        int[] ret = new Solution().exchange(ss);
        Assertions.assertEquals(res, TestUtils.integerArrayToString(ret));
    }
}