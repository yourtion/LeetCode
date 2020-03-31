package com.yourtion.leetcode.easy.c0824;

/**
 * 824. 山羊拉丁文
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/goat-latin/
 */
public class Solution {
    public String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        boolean isFirst = true;
        boolean isVowel = false;
        int index = 0;
        char[] arr = S.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            // 处理非字母和最后一个字母
            if (!Character.isLetter(c) || i == arr.length - 1) {
                if (i == arr.length - 1) {
                    temp.append(c);
                }
                if (temp.length() > 0) {
                    // 单词索引+1
                    index += 1;
                    // 处理非元音
                    if (!isVowel) {
                        temp.append(temp.charAt(0));
                        temp.deleteCharAt(0);
                    }
                    // 添加 ma
                    temp.append("ma");
                    // 根据单词索引 + a
                    for (int j = 0; j < index; j++) {
                        temp.append("a");
                    }
                }
                sb.append(temp);
                if (i != arr.length - 1) {
                    sb.append(c);
                }
                // 处理下一个单词
                temp = new StringBuilder();
                isFirst = true;
            } else {
                // 判断首字母
                if (isFirst) {
                    char cc = Character.toLowerCase(c);
                    isVowel = cc == 'a' || cc == 'e' || cc == 'i' || cc == 'o' || cc == 'u';
                    isFirst = false;
                }
                temp.append(c);
            }
        }
        return sb.toString();
    }
}
