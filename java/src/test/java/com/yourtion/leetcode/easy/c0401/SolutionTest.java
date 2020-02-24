package com.yourtion.leetcode.easy.c0401;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SolutionTest {

    void runTest(int source, String res) {
        System.out.printf("runTest: %d , res: %s \n", source, res);
        List<String> ret = Arrays.asList(res.split(","));
        List<String> r = new Solution().readBinaryWatch(source);
        Assertions.assertEquals(ret.size(), r.size());
        for (String a : r) {
            Assertions.assertTrue(ret.contains(a), "ret not contains:" + a);
        }
        for (String a : ret) {
            Assertions.assertTrue(r.contains(a), "r not contains:" + a);
        }
        Assertions.assertTrue(ret.containsAll(r), "ret.containsAll(r)");
        Assertions.assertTrue(r.containsAll(ret), "r.contains(ret)");
    }


    @Test
    void readBinaryWatch() {
        runTest(1, "0:04,8:00,0:16,0:02,0:01,1:00,4:00,0:32,2:00,0:08");
        runTest(0, "0:00");
        runTest(2, "0:03,0:05,0:06,0:09,0:10,0:12,0:17,0:18,0:20,0:24,0:33,0:34,0:36,0:40,0:48,1:01,1:02,1:04,1:08,1:16,1:32,2:01,2:02,2:04,2:08,2:16,2:32,3:00,4:01,4:02,4:04,4:08,4:16,4:32,5:00,6:00,8:01,8:02,8:04,8:08,8:16,8:32,9:00,10:00");
    }
}