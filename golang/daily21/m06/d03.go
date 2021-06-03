package y2021m06

// 每日一题 20210603
//
// 525. 连续数组
// Link: https://leetcode-cn.com/problems/contiguous-array/
func findMaxLength(nums []int) int {
	max := func(a, b int) int {
		if a > b {
			return a
		}
		return b
	}
	ret := 0
	mp := map[int]int{0: -1}
	counter := 0
	for i, num := range nums {
		if num == 1 {
			counter++
		} else {
			counter--
		}
		if prevIndex, has := mp[counter]; has {
			ret = max(ret, i-prevIndex)
		} else {
			mp[counter] = i
		}
	}
	return ret
}
