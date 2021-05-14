package y2021m05

import "strings"

// 每日一题 20210514
//
// 12. 整数转罗马数字
// Link: https://leetcode-cn.com/problems/integer-to-roman/
func intToRoman(num int) string {
	ret := strings.Builder{}
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
	for _, v := range strMap {
		for num >= v.n {
			ret.WriteString(v.s)
			num -= v.n
		}
	}
	return ret.String()
}
