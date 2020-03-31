package com.yourtion.leetcode.easy.c0824;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    void runTest(String source, String res) {
        System.out.printf("runTest: %s , res: %s \n", source, res);
        Assertions.assertEquals(res, new Solution().toGoatLatin(source));
    }

    @Test
    void toGoatLatin() {
        runTest("I speak Goat Latin", "Imaa peaksmaaa oatGmaaaa atinLmaaaaa");
        runTest("The quick brown fox jumped over the lazy dog", "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa");
    }
}