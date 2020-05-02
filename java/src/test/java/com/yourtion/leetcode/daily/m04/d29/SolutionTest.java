package com.yourtion.leetcode.daily.m04.d29;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200429")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3,4,5,3,1]", 3, 2),
                arguments("[0,1,2,4,2,1]", 3, -1),
                arguments("[0,5,3,1]", 1, 3)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findInMountainArray(String source, int target, int res) {
        System.out.printf("runTest: %s , res: %d ", source, res);
        MArr arr = new MArr(source);
        Assertions.assertEquals(res, new Solution().findInMountainArray(target, arr));
    }

    static class MArr implements Solution.MountainArray {

        private int[] arr;
        private int counter = 0;

        public MArr(String arrStr) {
            arr = TestUtils.stringToIntegerArray(arrStr);
        }

        @Override
        public int get(int index) {
            counter += 1;
            if (counter > 100) {
                return arr[-1];
            }
            return arr[index];
        }

        @Override
        public int length() {
            return arr.length;
        }
    }
}