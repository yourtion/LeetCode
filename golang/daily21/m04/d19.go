package y2021m04

// 每日一题 20210419
//
// 27. 移除元素
// Link: https://leetcode-cn.com/problems/remove-element/
func removeElement(nums []int, val int) int {
	j := 0
	for i := 0; i < len(nums); i++ {
		if nums[i] != val {
			nums[j] = nums[i]
			j += 1
		}
	}
	return j
}
