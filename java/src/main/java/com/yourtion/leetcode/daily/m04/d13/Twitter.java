package com.yourtion.leetcode.daily.m04.d13;

import javafx.util.Pair;

import java.util.*;

/**
 * 355. 设计推特
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/design-twitter/
 */
public class Twitter {
    private Map<Integer, Set<Integer>> followInfo;
    private List<Pair<Integer, Integer>> twitterInfo;

    /**
     * Initialize your data structure here.
     */
    public Twitter() {
        followInfo = new HashMap<>();
        twitterInfo = new ArrayList<>();
    }

    /**
     * Compose a new tweet.
     */
    public void postTweet(int userId, int tweetId) {
        twitterInfo.add(new Pair<>(userId, tweetId));
    }

    /**
     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {
        Set<Integer> follow = followInfo.getOrDefault(userId, new HashSet<>());
        List<Integer> ret = new ArrayList<>();
        for (int i = twitterInfo.size() - 1; i >= 0; i--) {
            Pair<Integer, Integer> p = twitterInfo.get(i);
            if (p.getKey() == userId || follow.contains(p.getKey())) {
                ret.add(p.getValue());
            }
            if (ret.size() == 10) {
                return ret;
            }
        }
        return ret;
    }

    /**
     * Follower follows a followee. If the operation is invalid, it should be a no-op.
     */
    public void follow(int followerId, int followeeId) {
        Set<Integer> follow = followInfo.getOrDefault(followerId, new HashSet<>());
        follow.add(followeeId);
        followInfo.put(followerId, follow);
    }

    /**
     * Follower unfollows a followee. If the operation is invalid, it should be a no-op.
     */
    public void unfollow(int followerId, int followeeId) {
        Set<Integer> follow = followInfo.getOrDefault(followerId, new HashSet<>());
        follow.remove(followeeId);
        followInfo.put(followerId, follow);
    }
}
