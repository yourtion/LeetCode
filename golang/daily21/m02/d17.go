package y2021m02

// 每日一题 20210217
//
// 566. 重塑矩阵
// Link: https://leetcode-cn.com/problems/reshape-the-matrix/
func matrixReshape(nums [][]int, r int, c int) [][]int {
	ro := len(nums)
	if ro < 1 {
		return nums
	}
	co := len(nums[0])
	if co == 0 || ro*co != r*c {
		return nums
	}
	ret := make([][]int, r)
	a, b := 0, 0
	for i := 0; i < r; i++ {
		ret[i] = make([]int, c)
		for j := 0; j < c; j++ {
			ret[i][j] = nums[a][b]
			b += 1
			if b == co {
				a += 1
				b = 0
			}
		}
	}
	return ret
}
