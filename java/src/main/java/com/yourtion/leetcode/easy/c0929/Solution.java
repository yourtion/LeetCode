package com.yourtion.leetcode.easy.c0929;

import java.util.HashSet;
import java.util.Set;

/**
 * 929. 独特的电子邮件地址
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/unique-email-addresses/
 */
public class Solution {
    private String processEmail(String email) {
        String[] a = email.split("@");
        return a[0].split("\\+")[0].replaceAll("\\.", "") + "@" + a[1];
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> ret = new HashSet<>();
        for (String e : emails) {
            ret.add(processEmail(e));
        }
        return ret.size();
    }
}
