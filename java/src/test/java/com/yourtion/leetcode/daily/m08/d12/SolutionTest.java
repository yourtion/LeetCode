package com.yourtion.leetcode.daily.m08.d12;

import com.yourtion.leetcode.TestUtils;
import com.yourtion.leetcode.utils.graph.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200812")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[2,4],[1,3],[2,4],[1,3]]", "[[2, 4],[1, 3],[2, 4],[1, 3]]"),
                arguments("[[]]", "[[]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void cloneGraph(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        Node node = TestUtils.stringToGraphNode(source);
        Node ret = new Solution().cloneGraph(node);
        Assertions.assertEquals(res, TestUtils.graphNodeToString(ret));
    }
}