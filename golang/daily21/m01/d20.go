package y2021m01

import "sort"

// 每日一题 20210120
//
// 628. 三个数的最大乘积
// Link: https://leetcode-cn.com/problems/maximum-product-of-three-numbers/
func maximumProduct(nums []int) int {
	n := len(nums)
	if n < 3 {
		return 0
	}
	max := func(a, b int) int {
		if a > b {
			return a
		}
		return b
	}
	sort.Ints(nums)
	return max(nums[0]*nums[1]*nums[n-1], nums[n-3]*nums[n-2]*nums[n-1])
}
