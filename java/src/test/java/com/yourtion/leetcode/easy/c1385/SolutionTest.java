package com.yourtion.leetcode.easy.c1385;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1385. 两个数组间的距离值")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[4,5,8]", "[10,9,1,8]", 2, 2),
                arguments("[1,4,2,3]", "[-4,-3,6,10,20,30]", 3, 2),
                arguments("[2,1,100,3]", "[-5,-2,10,-3,7]", 6, 1)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findTheDistanceValue(String a1, String a2, int d, int res) {
        System.out.printf("runTest: %s %s %d , res: %d", a1, a2, d, res);
        int[] arr1 = TestUtils.stringToIntegerArray(a1);
        int[] arr2 = TestUtils.stringToIntegerArray(a2);
        Assertions.assertEquals(res, new Solution().findTheDistanceValue(arr1, arr2, d));
    }
}