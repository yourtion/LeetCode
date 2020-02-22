package com.yourtion.leetcode.easy.c0374;

class GuessGame {
    private int res;

    GuessGame(int r) {
        res = r;
    }

    int guess(int num) {
        return Integer.compare(num, res) * -1;
    }

}

/**
 * 374. 猜数字大小
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/guess-number-higher-or-lower/
 */
public class Solution extends GuessGame {

    Solution(int r) {
        super(r);
    }

    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int r = guess(mid);
            if (r == 0) {
                return mid;
            }
            if (r < 0) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
