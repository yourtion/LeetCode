package com.yourtion.leetcode.easy.c1114;

import org.junit.jupiter.api.Test;

class FooTest {

    @Test
    void testFoo() throws InterruptedException {
        Foo f = new Foo();
        Thread t1 = new Thread(() -> {
            try {
                f.first(new MyT("first"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                f.second(new MyT("second"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t3 = new Thread(() -> {
            try {
                f.third(new MyT("third"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t3.start();
        t2.start();
        t1.start();
    }

    class MyT implements Runnable {
        private String w;

        public MyT(String p) {
            w = p;
        }

        @Override
        public void run() {
            System.out.print(w);
        }
    }

}