package y2021m04

// 每日一题 20210415
//
// 213. 打家劫舍 II
// Link: https://leetcode-cn.com/problems/house-robber-ii/
func rob(nums []int) int {
	max := func(a, b int) int {
		if a > b {
			return a
		}
		return b
	}
	_rob := func(nums []int) int {
		first, second := nums[0], max(nums[0], nums[1])
		for _, v := range nums[2:] {
			first, second = second, max(first+v, second)
		}
		return second
	}

	n := len(nums)
	if n == 1 {
		return nums[0]
	}
	if n == 2 {
		return max(nums[0], nums[1])
	}
	return max(_rob(nums[:n-1]), _rob(nums[1:]))
}
