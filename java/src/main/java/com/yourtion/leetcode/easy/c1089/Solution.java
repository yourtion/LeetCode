package com.yourtion.leetcode.easy.c1089;

/**
 * 1089. 复写零
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/duplicate-zeros/
 */
public class Solution {
    public void duplicateZeros(int[] arr) {
        int c = 0;
        for (int a : arr) {
            if (a == 0) {
                c += 1;
            }
        }
        //设置一个数组末尾的指针，从末尾开始遍历
        int ptr = arr.length - 1;
        //从末尾遍历是防止覆盖掉有用的元素，因为元素只能往后退，不从末尾开始遍历，前面的可能会覆盖掉后面的
        //开始从末尾遍历
        while (c != 0) {
            //遍历到0数字
            if (arr[ptr] == 0) {
                //首先，自己不会影响自己与前面数字的最终位置，所以count要减1
                c--;
                //根据自己前面0的个数往后退，注意越界
                if (ptr + c < arr.length) {
                    arr[ptr + c] = 0;
                }
                //还有自己复制，也要往后退，注意越界
                if (ptr + 1 + c < arr.length) {
                    arr[ptr + 1 + c] = 0;
                }
            } else {
                //遍历到非0数字时，根据它前面零的个数让它往后退，同时要注意有没有越界
                if (ptr + c < arr.length) {
                    arr[ptr + c] = arr[ptr];
                }
            }
            ptr--;
        }
    }
}
