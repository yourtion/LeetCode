package com.yourtion.leetcode.easy.c9038;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 17.10. 主要元素")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,5,9,5,9,5,5,5]", 5),
                arguments("[3,2]", -1),
                arguments("[2,2,1,1,1,2,2]", 2),
                arguments("[3,2,2]", 2),
                arguments("[1,2,3,3]", -1)
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