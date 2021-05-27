package y2021m05

// 每日一题 20210527
//
// 461. 汉明距离
// Link: https://leetcode-cn.com/problems/hamming-distance/
func hammingDistance(x int, y int) int {
	ret := 0
	for i := 0; i < 32 && (x > 0 || y > 0); i++ {
		ret += (x & 1) ^ (y & 1)
		x >>= 1
		y >>= 1
	}
	return ret
}
