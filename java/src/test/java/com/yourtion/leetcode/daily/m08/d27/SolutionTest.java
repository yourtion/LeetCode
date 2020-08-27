package com.yourtion.leetcode.daily.m08.d27;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("每日一题 - 20200827")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[\"MUC\", \"LHR\"], [\"JFK\", \"MUC\"], [\"SFO\", \"SJC\"], [\"LHR\", \"SFO\"]]",
                        new String[]{"JFK", "MUC", "LHR", "SFO", "SJC"}),
                arguments("[[\"JFK\",\"SFO\"],[\"JFK\",\"ATL\"],[\"SFO\",\"ATL\"],[\"ATL\",\"JFK\"],[\"ATL\",\"SFO\"]]",
                        new String[]{"JFK", "ATL", "JFK", "SFO", "ATL", "SFO"})
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void findItinerary(String source, String[] res) {
        System.out.printf("runTest: %s , res: %s", source, Arrays.toString(res));
        List<List<String>> ss = TestUtils.stringToString2dArray(source);
        Assertions.assertEquals(Arrays.toString(res), new Solution().findItinerary(ss).toString());
    }
}