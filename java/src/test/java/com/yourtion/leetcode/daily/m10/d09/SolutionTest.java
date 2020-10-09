package com.yourtion.leetcode.daily.m10.d09;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201009")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[3,2,0,-4]", 1, true),
                arguments("[3,2,0,-4]", -1, false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void hasCycle(String source, int pos, boolean res) {
        System.out.printf("runTest: %s %d, res: %b", source, pos, res);
        ListNode tn = TestUtils.stringToListNodeWithCycle(source, pos);
        Assertions.assertEquals(res, new Solution().hasCycle(tn));
    }
}