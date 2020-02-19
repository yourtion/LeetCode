package com.yourtion.leetcode.easy.c0299;

/**
 * 299. 猜数字游戏
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/bulls-and-cows/
 */
public class Solution {
    public String getHint(String secret, String guess) {
        int a = 0;
        int b = secret.length();
        int[] table = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                a += 1;
                b -= 1;
            }
            table[secret.charAt(i) - '0']++;
            table[guess.charAt(i) - '0']--;
        }
        for (int j : table) {
            if (j > 0) {
                b -= j;
            }
        }
        return a + "A" + b + "B";
    }
}
