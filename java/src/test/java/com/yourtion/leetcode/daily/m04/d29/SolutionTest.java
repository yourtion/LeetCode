package com.yourtion.leetcode.daily.m04.d29;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, int target, int res) {
        System.out.printf("runTest: %s , res: %d \n", source, res);
        MArr arr = new MArr(source);
        Assertions.assertEquals(res, new Solution().findInMountainArray(target, arr));
    }

    @Test
    void findInMountainArray() {
        runTest("[1,2,3,4,5,3,1]", 3, 2);
        runTest("[0,1,2,4,2,1]", 3, -1);
        runTest("[0,5,3,1]", 1, 3);
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