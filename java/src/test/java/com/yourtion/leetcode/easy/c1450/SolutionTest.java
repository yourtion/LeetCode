package com.yourtion.leetcode.easy.c1450;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1450. 在既定时间做作业的学生人数")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[1,2,3]", "[3,2,7]", 4, 1),
                arguments("[4]", "[4]", 4, 1),
                arguments("[4]", "[4]", 5, 0),
                arguments("[1,1,1,1]", "[1,3,2,4]", 7, 0),
                arguments("[9,8,7,6,5,4,3,2,1]", "[10,10,10,10,10,10,10,10,10]", 5, 5)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void busyStudent(String startTime, String endTime, int queryTime, int res) {
        System.out.printf("runTest: %s %s %d , res: %d", startTime, endTime, queryTime, res);
        int[] start = TestUtils.stringToIntegerArray(startTime);
        int[] end = TestUtils.stringToIntegerArray(endTime);
        Assertions.assertEquals(res, new Solution().busyStudent(start, end, queryTime));
    }
}