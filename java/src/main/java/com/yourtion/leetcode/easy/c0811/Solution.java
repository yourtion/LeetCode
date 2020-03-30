package com.yourtion.leetcode.easy.c0811;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 811. 子域名访问计数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/subdomain-visit-count/
 */
public class Solution {

    String[] getDomain(String domain) {
        String[] split = domain.split("[.]");
        String[] ret = new String[split.length];
        StringBuilder sb = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            sb.insert(0, split[i]).insert(0, ".");
            ret[i] = sb.substring(1);
        }
        return ret;
    }

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>(16);
        for (String s : cpdomains) {
            String[] split = s.split(" ");
            int count = Integer.parseInt(split[0]);
            String[] domains = getDomain(split[1]);
            for (String d : domains) {
                map.put(d, map.getOrDefault(d, 0) + count);
            }
        }
        List<String> ret = new ArrayList<>();
        for (Map.Entry<String, Integer> s : map.entrySet()) {
            ret.add(s.getValue() + " " + s.getKey());
        }
        return ret;
    }
}
