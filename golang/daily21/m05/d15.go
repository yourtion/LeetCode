package y2021m05

// 每日一题 20210515
//
// 13. 罗马数字转整数
// Link: https://leetcode-cn.com/problems/roman-to-integer/
func romanToInt(s string) int {
	strMap := []struct {
		n int
		s string
	}{
		{1000, "M"},
		{900, "CM"},
		{500, "D"},
		{400, "CD"},
		{100, "C"},
		{90, "XC"},
		{50, "L"},
		{40, "XL"},
		{10, "X"},
		{9, "IX"},
		{5, "V"},
		{4, "IV"},
		{1, "I"},
	}
	ret, i, n := 0, 0, len(s)
	for _, v := range strMap {
		for i < n {
			k := i + len(v.s)
			if k > n || s[i:k] != v.s {
				break
			}
			ret += v.n
			i += len(v.s)
		}
	}
	return ret
}
