package y2021m04

// 每日一题 20210406
//
// 80. 删除有序数组中的重复项 II
// Link: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/
func removeDuplicates2(nums []int) int {
	i, j := 0, 0
	for i < len(nums) && j < len(nums) {
		k := j
		for k < len(nums) && nums[k] == nums[j] {
			k += 1
		}
		nums[i] = nums[j]
		i += 1
		if k-j > 1 {
			nums[i] = nums[j]
			i += 1
		}
		j = k
	}
	return i
}
