package y2021m04

import (
	"sort"
)

// 每日一题 20210407
//
// 81. 搜索旋转排序数组 II
// Link: https://leetcode-cn.com/problems/search-in-rotated-sorted-array-ii/
func search(nums []int, target int) bool {
	j, k := len(nums), 0
	for i := 1; i < j; i++ {
		if nums[i] < nums[i-1] {
			k = i
			break
		}
	}
	a := sort.SearchInts(nums[0:k], target)
	if a > -1 && a < k && nums[a] == target {
		return true
	}
	b := sort.SearchInts(nums[k:j], target)
	if b > -1 && b+k < j && nums[b+k] == target {
		return true
	}
	return false
}
