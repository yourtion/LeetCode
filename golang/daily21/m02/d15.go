package y2021m02

// 每日一题 20210215
//
// 485. 最大连续1的个数
// Link: https://leetcode-cn.com/problems/max-consecutive-ones/
func findMaxConsecutiveOnes(nums []int) int {
	max := func(a, b int) int {
		if a > b {
			return a
		}
		return b
	}
	count, ret := 0, 0
	for _, v := range nums {
		if v == 1 {
			count++
		} else {
			ret = max(ret, count)
			count = 0
		}
	}
	ret = max(ret, count)
	return ret
}
