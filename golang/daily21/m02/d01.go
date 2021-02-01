package y2021m02

// 每日一题 20210201
//
// 888. 公平的糖果棒交换
// Link: https://leetcode-cn.com/problems/fair-candy-swap/
func fairCandySwap(A []int, B []int) []int {
	sumA, sumB := 0, 0
	mapB := map[int]bool{}
	for _, v := range A {
		sumA += v
	}
	for _, v := range B {
		sumB += v
		mapB[v] = true
	}
	mid := (sumA + sumB) / 2
	ka := sumA - mid
	for _, a := range A {
		if _, ok := mapB[a-ka]; ok {
			return []int{a, a - ka}
		}
	}
	return nil
}
