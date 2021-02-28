package y2021m02

// 每日一题 20210228
//
// 896. 单调数列
// Link: https://leetcode-cn.com/problems/monotonic-array/
func isMonotonic(A []int) bool {
	n := len(A)
	desc, inc := true, true
	for i := 1; i < n; i++ {
		if A[i] > A[i-1] {
			desc = false
		}
		if A[i-1] > A[i] {
			inc = false
		}
	}
	return desc || inc
}
