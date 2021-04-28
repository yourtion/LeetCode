package y2021m04

import "math"

// 每日一题 20210428
//
// 633. 平方数之和
// Link: https://leetcode-cn.com/problems/sum-of-square-numbers/
func judgeSquareSum(c int) bool {
	left, right := 0, int(math.Sqrt(float64(c)))
	for left <= right {
		sum := left*left + right*right
		if sum == c {
			return true
		} else if sum > c {
			right--
		} else {
			left++
		}
	}
	return false
}
