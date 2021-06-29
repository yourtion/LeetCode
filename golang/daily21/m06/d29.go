package y2021m06

// 每日一题 20210629
//
// 168. Excel表列名称
// Link: https://leetcode-cn.com/problems/excel-sheet-column-title/
func convertToTitle(columnNumber int) string {
	ans := []byte{}
	for columnNumber > 0 {
		columnNumber--
		ans = append(ans, 'A'+byte(columnNumber%26))
		columnNumber /= 26
	}
	for i, n := 0, len(ans); i < n/2; i++ {
		ans[i], ans[n-1-i] = ans[n-1-i], ans[i]
	}
	return string(ans)
}
