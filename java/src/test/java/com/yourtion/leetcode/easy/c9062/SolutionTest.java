package com.yourtion.leetcode.easy.c9062;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题52. 两个链表的第一个公共节点")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[4,1,8,4,5]", "[5,0,1,8,4,5]", 2, 3, 8),
                arguments("[0,9,1,2,4]", "[3,2,4]", 3, 1, 2),
                arguments("[2,6,4]", "[1,5]", 3, 2, 0));
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void getIntersectionNode(String s1, String s2, int sk1, int sk2, int res) {
        System.out.printf("runTest: %s %d + %s %d , res: %d", s1, sk1, s2, sk2, res);
        ListNode tn1 = TestUtils.stringToListNode(s1);
        ListNode tn2 = TestUtils.stringToListNode(s2);
        ListNode r = TestUtils.combineList(tn1, tn2, sk1, sk2);
        ListNode ret = new Solution().getIntersectionNode(tn1, tn2);
        if (r != null) {
            Assertions.assertEquals(res, ret.val);
            Assertions.assertEquals(r, ret);
        } else {
            Assertions.assertNull(ret);
        }
    }
}