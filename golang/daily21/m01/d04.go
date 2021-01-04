package y2021m01

var memo = map[int]int{0: 0, 1: 1}

// 每日一题 20210104
//
// 509. 斐波那契数
// Link: https://leetcode-cn.com/problems/fibonacci-number/
func fib(n int) int {
	if v, ok := memo[n]; ok {
		return v
	}
	memo[n] = fib(n-2) + fib(n-1)
	return memo[n]
}
