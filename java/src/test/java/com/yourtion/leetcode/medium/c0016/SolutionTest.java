package com.yourtion.leetcode.medium.c0016;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("16. 最接近的三数之和")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[-1,2,1,-4]", 1, 2)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void threeSumClosest(String source, int target, int res) {
        System.out.printf("runTest: %s %d , res: %d", source, target, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().threeSumClosest(ss, target));
    }
}