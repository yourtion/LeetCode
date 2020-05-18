package com.yourtion.leetcode.easy.c9028;

import com.yourtion.leetcode.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("面试题 08.06. 汉诺塔问题")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments("[2, 1, 0]", "[2, 1, 0]"),
                arguments("[1, 0]", "[1, 0]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void hanota(String source, String res) {
        System.out.printf("runTest: %s , res: %s", source, res);
        List<Integer> la = IntStream.of(TestUtils.stringToIntegerArray(source)).boxed().collect(Collectors.toList());
        List<Integer> lb = new ArrayList<>();
        List<Integer> lc = new ArrayList<>();
        new Solution().hanota(la, lb, lc);
        Assertions.assertEquals(res, lc.toString());
    }
}