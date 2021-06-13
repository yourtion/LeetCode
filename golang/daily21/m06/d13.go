package y2021m06

import "sort"

var isBadVersion func(version int) bool

// 每日一题 20210613
//
// 278. 第一个错误的版本
// Link: https://leetcode-cn.com/problems/first-bad-version/
func firstBadVersion(n int) int {
	return sort.Search(n, isBadVersion)
}
