package y2021m02

import "sort"

// 每日一题 20210205
//
// 1208. 尽可能使字符串相等
// Link: https://leetcode-cn.com/problems/get-equal-substrings-within-budget/
func equalSubstring(s string, t string, maxCost int) int {
	abs := func(x int) int {
		if x < 0 {
			return -x
		}
		return x
	}

	max := func(a, b int) int {
		if a > b {
			return a
		}
		return b
	}

	n := len(s)
	maxLen := 0
	accDiff := make([]int, n+1)
	for i, ch := range s {
		accDiff[i+1] = accDiff[i] + abs(int(ch)-int(t[i]))
	}
	for i := 1; i <= n; i++ {
		start := sort.SearchInts(accDiff[:i], accDiff[i]-maxCost)
		maxLen = max(maxLen, i-start)
	}
	return maxLen
}
