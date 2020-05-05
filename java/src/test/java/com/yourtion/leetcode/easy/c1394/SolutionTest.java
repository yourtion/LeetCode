package com.yourtion.leetcode.easy.c1394;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1394. 找出数组中的幸运数")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[2,2,3,4]", 2),
                arguments("[1,2,2,3,3,3]", 3),
                arguments("[2,2,2,3,3]", -1),
                arguments("[5]", -1),
                arguments("[7,7,7,7,7,7,7]", 7)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findLucky(String source, int res) {
        System.out.printf("runTest: %s , res: %d", source, res);
        int[] arr = TestUtils.stringToIntegerArray(source);
        Assertions.assertEquals(res, new Solution().findLucky(arr));
    }
}