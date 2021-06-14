package y2021m06

import "sort"

var guess func(num int) int

// 每日一题 20210614
//
// 374. 猜数字大小
// Link: https://leetcode-cn.com/problems/guess-number-higher-or-lower/
func guessNumber(n int) int {
	return sort.Search(n, func(x int) bool { return guess(x) <= 0 })
}
