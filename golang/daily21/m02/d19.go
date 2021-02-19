package y2021m02

// 每日一题 20210219
//
// 1004. 最大连续1的个数 III
// Link: https://leetcode-cn.com/problems/max-consecutive-ones-iii/
func longestOnes(A []int, K int) int {
	max := func(a, b int) int {
		if a > b {
			return a
		}
		return b
	}
	left, l, r, ret := 0, 0, 0, 0
	for right, v := range A {
		r += 1 - v
		for l < r-K {
			l += 1 - A[left]
			left++
		}
		ret = max(ret, right-left+1)
	}
	return ret
}
