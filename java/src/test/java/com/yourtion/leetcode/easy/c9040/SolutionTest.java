package com.yourtion.leetcode.easy.c9040;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题03. 数组中重复的数字")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[2, 3, 1, 0, 2, 5, 3]", 2),
                arguments("[0,1,2,3,4,0]", 0),
                arguments("[4,1,2,3,4,0]", 4)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findRepeatNumber(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        int[] ss = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().findRepeatNumber(ss));
    }
}