package y2021m04

// 每日一题 20210410
//
// 263. 丑数
// Link: https://leetcode-cn.com/problems/ugly-number/
func isUgly(n int) bool {
	if n <= 0 {
		return false
	}
	for _, num := range []int{2, 3, 5} {
		for n%num == 0 {
			n /= num
		}
	}
	return n == 1
}
