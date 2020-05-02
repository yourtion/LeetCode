package com.yourtion.leetcode.daily.m03.d26;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200326")
class SolutionTest {
    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\"p\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\"R\",\".\",\".\",\".\",\"p\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\"p\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"]]", 3),
                arguments("[[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\"p\",\"p\",\"p\",\"p\",\"p\",\".\",\".\"],[\".\",\"p\",\"p\",\"B\",\"p\",\"p\",\".\",\".\"],[\".\",\"p\",\"B\",\"R\",\"B\",\"p\",\".\",\".\"],[\".\",\"p\",\"p\",\"B\",\"p\",\"p\",\".\",\".\"],[\".\",\"p\",\"p\",\"p\",\"p\",\"p\",\".\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"]]", 0),
                arguments("[[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\"p\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\"p\",\".\",\".\",\".\",\".\"],[\"p\",\"p\",\".\",\"R\",\".\",\"p\",\"B\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\"B\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\"p\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"]]", 3)
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void numRookCaptures(String source, int res) {
        System.out.printf("runTest: %s , res: %d ", source, res);
        char[][] ss = TestUtils.stringToChar2dArray(source);
        Assertions.assertEquals(res, new Solution().numRookCaptures(ss));
    }
}