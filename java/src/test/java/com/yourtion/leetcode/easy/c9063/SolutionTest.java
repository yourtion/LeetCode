package com.yourtion.leetcode.easy.c9063;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题53 - I. 在排序数组中查找数字 I")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[5,7,7,7,7,8,8,10]", 8, 2),
                arguments("[5,7,7,7,8,8,10]", 8, 2),

                arguments("[5,7,7,8,8,10]", 6, 0)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void search(String source, int target, int res) {
        System.out.printf("runTest: %s %d , res: %d", source, target, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().search(ss, target));
    }
}