package y2021m04

// 每日一题 20210430
//
// 137. 只出现一次的数字 II
// Link: https://leetcode-cn.com/problems/single-number-ii/
func singleNumber(nums []int) int {
	a, b := 0, 0
	for _, num := range nums {
		b = (b ^ num) &^ a
		a = (a ^ num) &^ b
	}
	return b
}
