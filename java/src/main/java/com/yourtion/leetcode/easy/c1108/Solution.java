package com.yourtion.leetcode.easy.c1108;

/**
 * 1108. IP 地址无效化
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/defanging-an-ip-address/
 */
public class Solution {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
