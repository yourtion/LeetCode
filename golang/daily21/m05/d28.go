package y2021m05

// 每日一题 20210528
//
// 477. 汉明距离总和
// Link: https://leetcode-cn.com/problems/total-hamming-distance/
func totalHammingDistance(nums []int) int {
	n := len(nums)
	ret := 0
	for i := 0; i < 30; i++ {
		c := 0
		for _, val := range nums {
			c += val >> i & 1
		}
		ret += c * (n - c)
	}
	return ret
}
