package com.yourtion.leetcode.easy.c9037;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 17.04. 消失的数字")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[3,0,1]", 2),
                arguments("[9,6,4,2,3,5,7,0,1]", 8),
                arguments("[]", 0)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void missingNumber(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().missingNumber(ss));
    }
}