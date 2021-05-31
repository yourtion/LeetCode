package y2021m05

// 每日一题 20210531
//
// 342. 4的幂
// Link: https://leetcode-cn.com/problems/power-of-four/
func isPowerOfFour(n int) bool {
	return n > 0 && n&(n-1) == 0 && n&0xaaaaaaaa == 0
}
