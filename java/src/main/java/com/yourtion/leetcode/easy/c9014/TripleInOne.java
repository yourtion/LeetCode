package com.yourtion.leetcode.easy.c9014;

/**
 * 9014. 面试题 03.01. 三合一
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/three-in-one-lcci/
 */
public class TripleInOne {
    int size;
    int[] arr;
    int[] pos;

    public TripleInOne(int stackSize) {
        size = stackSize;
        arr = new int[size * 3];
        pos = new int[3];
    }

    public void push(int stackNum, int value) {
        if (pos[stackNum] == size) {
            return;
        }
        arr[stackNum * size + pos[stackNum]++] = value;
    }

    public int pop(int stackNum) {
        if (pos[stackNum] == 0) {
            return -1;
        }
        return arr[stackNum * size + (pos[stackNum]--) - 1];
    }

    public int peek(int stackNum) {
        if (pos[stackNum] == 0) {
            return -1;
        }
        return arr[stackNum * size + pos[stackNum] - 1];
    }

    public boolean isEmpty(int stackNum) {
        return pos[stackNum] == 0;
    }
}
