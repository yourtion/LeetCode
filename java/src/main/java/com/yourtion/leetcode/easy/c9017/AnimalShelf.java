package com.yourtion.leetcode.easy.c9017;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 9017. 面试题 03.06. 动物收容所
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/animal-shelter-lcci/
 */
public class AnimalShelf {
    int count = 0;
    Queue<int[]> cat = new LinkedList<>();
    Queue<int[]> dog = new LinkedList<>();

    public AnimalShelf() {

    }

    public void enqueue(int[] animal) {
        Queue<int[]> q = animal[1] == 0 ? cat : dog;
        q.add(new int[]{animal[0], count++});
    }

    public int[] dequeueAny() {
        if (dog.isEmpty()) {
            return dequeueCat();
        }
        if (cat.isEmpty()) {
            return dequeueDog();
        }
        int[] d = dog.peek();
        int[] c = cat.peek();
        return d[1] < c[1] ? dequeueDog() : dequeueCat();
    }

    public int[] dequeueDog() {
        if (dog.isEmpty()) {
            return new int[]{-1, -1};
        }
        int[] d = dog.poll();
        return new int[]{d[0], 1};
    }

    public int[] dequeueCat() {
        if (cat.isEmpty()) {
            return new int[]{-1, -1};
        }
        int[] c = cat.poll();
        return new int[]{c[0], 0};
    }
}
