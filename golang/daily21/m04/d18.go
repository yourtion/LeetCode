package y2021m04

// 每日一题 20210418
//
// 26. 删除有序数组中的重复项
// Link: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
func removeDuplicates(nums []int) int {
	n := len(nums)
	if n < 2 {
		return n
	}
	j := 0
	for i := 1; i < n; i++ {
		if nums[i] != nums[j] {
			j += 1
			nums[j] = nums[i]
		}
	}
	return j + 1
}
