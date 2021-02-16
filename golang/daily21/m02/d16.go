package y2021m02

import "sort"

// 每日一题 20210216
//
// 561. 数组拆分 I
// Link: https://leetcode-cn.com/problems/array-partition-i/
func arrayPairSum(nums []int) int {
	sort.Ints(nums)
	ret := 0
	for i := 0; i < len(nums); i += 2 {
		ret += nums[i]
	}
	return ret
}
