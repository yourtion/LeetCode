package y2021m01

// 每日一题 20210108
//
// 189. 旋转数组
// Link: https://leetcode-cn.com/problems/rotate-array/
func rotate(nums []int, k int) {
	newNums := make([]int, len(nums))
	for i, v := range nums {
		newNums[(i+k)%len(nums)] = v
	}
	copy(nums, newNums)
}
