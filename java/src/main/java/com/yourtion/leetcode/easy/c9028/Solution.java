package com.yourtion.leetcode.easy.c9028;

import java.util.List;

/**
 * 9028. 面试题 08.06. 汉诺塔问题
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/hanota-lcci/
 */
public class Solution {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        int n = A.size();
        move(n, A, B, C);
    }

    private void move(int n, List<Integer> A, List<Integer> B, List<Integer> C) {
        if (n == 1) {
            int k = A.size() - 1;
            C.add(A.get(k));
            A.remove(k);
            return;
        }

        // 将A上面n-1个通过C移到B
        move(n - 1, A, C, B);
        int k = A.size() - 1;
        // 将A最后一个移到C
        C.add(A.get(k));
        // 这时，A空了
        A.remove(k);
        // 将B上面n-1个通过空的A移到C
        move(n - 1, B, A, C);
    }
}
