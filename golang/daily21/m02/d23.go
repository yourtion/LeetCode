package y2021m02

// 每日一题 20210223
//
// 1052. 爱生气的书店老板
// Link: https://leetcode-cn.com/problems/grumpy-bookstore-owner/
func maxSatisfied(customers []int, grumpy []int, X int) int {
	max := func(a, b int) int {
		if a > b {
			return a
		}
		return b
	}
	total := 0
	n := len(customers)
	for i := 0; i < n; i++ {
		if grumpy[i] == 0 {
			total += customers[i]
		}
	}
	increase := 0
	for i := 0; i < X; i++ {
		increase += customers[i] * grumpy[i]
	}
	maxIncrease := increase
	for i := X; i < n; i++ {
		increase = increase - customers[i-X]*grumpy[i-X] + customers[i]*grumpy[i]
		maxIncrease = max(maxIncrease, increase)
	}
	return total + maxIncrease
}
