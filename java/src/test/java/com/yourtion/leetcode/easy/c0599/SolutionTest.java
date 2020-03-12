package com.yourtion.leetcode.easy.c0599;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {
    void runTest(String s1, String s2, String res) {
        System.out.printf("runTest: %s %s, res: %s \n", s1, s2, res);
        String[] s1s = TestUtils.stringToStringArray(s1);
        String[] s2s = TestUtils.stringToStringArray(s2);
        Assertions.assertEquals(res, Arrays.toString(new Solution().findRestaurant(s1s, s2s)));
    }

    @Test
    void findRestaurant() {
        runTest("Shogun,Tapioca Express,Burger King,KFC", "Piatti,The Grill at Torrey Pines,Hungry Hunter Steakhouse,Shogun", "[Shogun]");
        runTest("Shogun,Tapioca Express,Burger King,KFC", "KFC,Shogun,Burger King", "[Shogun]");
        runTest("Shogun,KFC,Burger King,Tapioca Express", "KFC,Shogun,Burger King", "[Shogun, KFC]");
    }
}