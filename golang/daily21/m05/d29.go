package y2021m05

// 每日一题 20210529
//
// 1074. 元素和为目标值的子矩阵数量
// Link: https://leetcode-cn.com/problems/number-of-submatrices-that-sum-to-target/
func numSubmatrixSumTarget(matrix [][]int, target int) int {
	subarraySum := func(nums []int, k int) int {
		ret := 0
		mp := map[int]int{0: 1}
		for i, pre := 0, 0; i < len(nums); i++ {
			pre += nums[i]
			if _, ok := mp[pre-k]; ok {
				ret += mp[pre-k]
			}
			mp[pre]++
		}
		return ret
	}

	ret := 0
	for i := range matrix { // 枚举上边界
		sum := make([]int, len(matrix[0]))
		for _, row := range matrix[i:] { // 枚举下边界
			for c, v := range row {
				sum[c] += v // 更新每列的元素和
			}
			ret += subarraySum(sum, target)
		}
	}
	return ret
}
