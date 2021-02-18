package y2021m02

// 每日一题 20210218
//
// 995. K 连续位的最小翻转次数
// Link: https://leetcode-cn.com/problems/minimum-number-of-k-consecutive-bit-flips/
func minKBitFlips(A []int, K int) int {
	n := len(A)
	revCnt, ret := 0, 0
	for i, v := range A {
		if i >= K && A[i-K] > 1 {
			revCnt ^= 1
		}
		if v == revCnt {
			if i+K > n {
				return -1
			}
			ret += 1
			revCnt ^= 1
			A[i] += 2
		}
	}
	return ret
}
