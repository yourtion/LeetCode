package com.yourtion.leetcode.daily.m10.d10;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20201010")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[3,2,0,-4]", 1, 2),
                arguments("[1,2]", 0, 1),
                arguments("[1]", -1, -1)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void detectCycle(String source, int pos, int res) {
        System.out.printf("runTest: %s %d, res: %d", source, pos, res);
        ListNode tn = TestUtils.stringToListNodeWithCycle(source, pos);
        if (res == -1) {
            Assertions.assertNull(new Solution().detectCycle(tn));
        } else {
            Assertions.assertEquals(res, new Solution().detectCycle(tn).val);
        }
    }
}