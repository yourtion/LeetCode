package com.yourtion.leetcode.daily.m04.d26;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200426")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(new String[]{"[1,4,5]", "[1,3,4]", "[2,6]"}, "[1, 1, 2, 3, 4, 4, 5, 6]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void mergeKLists(String[] source, String res) {
        System.out.printf("runTest: %s , res: %s ", Arrays.toString(source), res);
        ListNode[] list = new ListNode[source.length];
        for (int i = 0; i < source.length; i++) {
            list[i] = TestUtils.stringToListNode(source[i]);
        }
        ListNode ret = new Solution().mergeKLists(list);
        Assertions.assertEquals(res, TestUtils.listNodeToString(ret));
    }
}