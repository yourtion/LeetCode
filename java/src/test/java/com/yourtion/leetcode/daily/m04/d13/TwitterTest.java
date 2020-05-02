package com.yourtion.leetcode.daily.m04.d13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

@DisplayName("每日一题 - 20200413")
class TwitterTest {

    @Test
    void testTwitter() {
        Twitter twitter = new Twitter();
        System.out.println("用户1发送了一条新推文 (用户id = 1, 推文id = 5).");
        twitter.postTweet(1, 5);
        // 用户1的获取推文应当返回一个列表，其中包含一个id为5的推文.
        List<Integer> l = twitter.getNewsFeed(1);
        Assertions.assertEquals(1, l.size());
        Assertions.assertEquals(5, l.get(0));

        System.out.println("用户1关注了用户2.");
        twitter.follow(1, 2);

        System.out.println("用户2发送了一个新推文 (推文id = 6).");
        twitter.postTweet(2, 6);

        System.out.println("用户1的获取推文应当返回一个列表，其中包含两个推文，id分别为 -> [6, 5].");
        // 推文id6应当在推文id5之前，因为它是在5之后发送的.
        List<Integer> l2 = twitter.getNewsFeed(1);
        Assertions.assertEquals(2, l2.size());
        Assertions.assertEquals(6, l2.get(0));
        Assertions.assertEquals(5, l2.get(1));


        System.out.println("用户1取消关注了用户2.");
        twitter.unfollow(1, 2);

        System.out.println("用户1的获取推文应当返回一个列表，其中包含一个id为5的推文.");
        // 因为用户1已经不再关注用户2
        twitter.getNewsFeed(1);
        Assertions.assertEquals(1, l.size());
        Assertions.assertEquals(5, l.get(0));
    }
}