package com.yourtion.leetcode.easy.c1436;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("1436. 旅行终点站")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[[\"London\",\"New York\"],[\"New York\",\"Lima\"],[\"Lima\",\"Sao Paulo\"]]", "Sao Paulo"),
                arguments("[[\"B\",\"C\"],[\"D\",\"B\"],[\"C\",\"A\"]]", "A"),
                arguments("[[\"A\",\"Z\"]]", "Z")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void destCity(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        List<List<String>> list = TestUtils.stringToString2dArray(source);
        Assertions.assertEquals(res, new Solution().destCity(list));
    }
}