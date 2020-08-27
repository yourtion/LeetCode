package com.yourtion.leetcode.daily.m08.d27;

import java.util.*;

/**
 * 332. 重新安排行程
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/reconstruct-itinerary/
 */
public class Solution {
    private final Map<String, PriorityQueue<String>> map = new HashMap<>();
    private final List<String> itinerary = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> ticket : tickets) {
            String src = ticket.get(0), dst = ticket.get(1);
            if (!map.containsKey(src)) {
                map.put(src, new PriorityQueue<>());
            }
            map.get(src).offer(dst);
        }
        dfs("JFK");
        Collections.reverse(itinerary);
        return itinerary;
    }

    private void dfs(String curr) {
        while (map.containsKey(curr) && map.get(curr).size() > 0) {
            String tmp = map.get(curr).poll();
            dfs(tmp);
        }
        itinerary.add(curr);
    }
}
