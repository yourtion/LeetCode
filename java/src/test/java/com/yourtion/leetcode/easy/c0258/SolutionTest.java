package com.yourtion.leetcode.easy.c0258;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    int addDigitsOld(int num) {
        if (num < 10) {
            return num;
        }
        int n = 0;
        while (num > 0) {
            n += num % 10;
            num /= 10;
        }
        return addDigitsOld(n);
    }

    @Test
    void addDigits() {
        System.out.println("runTest for addDigits");
        Assertions.assertEquals(2, new Solution().addDigits(38));
        for (int i = 0; i < 10000; i++) {
            Assertions.assertEquals(addDigitsOld(i), new Solution().addDigits(i));
        }
    }
}