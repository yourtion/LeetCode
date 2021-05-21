package y2021m05

// 每日一题 20210521
//
// 1035. 不相交的线
// Link: https://leetcode-cn.com/problems/uncrossed-lines/
func maxUncrossedLines(nums1 []int, nums2 []int) int {
	max := func(a, b int) int {
		if a > b {
			return a
		}
		return b
	}

	m, n := len(nums1), len(nums2)
	dp := make([][]int, m+1)
	for i := range dp {
		dp[i] = make([]int, n+1)
	}
	for i, v := range nums1 {
		for j, w := range nums2 {
			if v == w {
				dp[i+1][j+1] = dp[i][j] + 1
			} else {
				dp[i+1][j+1] = max(dp[i][j+1], dp[i+1][j])
			}
		}
	}
	return dp[m][n]
}
