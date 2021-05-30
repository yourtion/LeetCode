package y2021m05

// 每日一题 20210530
//
// 231. 2 的幂
// Link: https://leetcode-cn.com/problems/power-of-two/
func isPowerOfTwo(n int) bool {
	const big = 1 << 30
	return n > 0 && big%n == 0
}
