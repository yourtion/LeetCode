package com.yourtion.leetcode.medium.c0049;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("49. 字母异位词分组")
class SolutionTest {

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}, "[[eat, tea, ate], [bat], [tan, nat]]")
        );
    }

    @ParameterizedTest()
    @MethodSource("testDataProvider")
    void groupAnagrams(String[] source, String res) {
        System.out.printf("runTest: %s , res: %s", Arrays.toString(source), res);
        List<List<String>> lists = new Solution().groupAnagrams(source);
        Assertions.assertEquals(res, lists.toString());
    }
}