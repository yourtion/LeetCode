package y2021m02

// 每日一题 20210212
//
// 119. 杨辉三角 II
// Link: https://leetcode-cn.com/problems/pascals-triangle-ii/
func getRow(rowIndex int) []int {
	rows := make([][]int, rowIndex+1)
	for i := range rows {
		rows[i] = make([]int, i+1)
		rows[i][0], rows[i][i] = 1, 1
		for j := 1; j < i; j++ {
			rows[i][j] = rows[i-1][j-1] + rows[i-1][j]
		}
	}
	return rows[rowIndex]
}
