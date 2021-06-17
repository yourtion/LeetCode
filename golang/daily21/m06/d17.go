package y2021m06

// 每日一题 20210617
//
// 65. 有效数字
// Link: https://leetcode-cn.com/problems/valid-number/
func isNumber(s string) bool {
	if len(s) == 0 {
		return false
	}
	isNum := false
	isDot := false
	iseOrE := false
	for i := range s {
		if s[i] >= '0' && s[i] <= '9' {
			isNum = true
		} else if s[i] == '.' {
			if isDot || iseOrE {
				return false
			}
			isDot = true
		} else if s[i] == 'e' || s[i] == 'E' {
			if !isNum || iseOrE {
				return false
			}
			iseOrE = true
			isNum = false
		} else if s[i] == '-' || s[i] == '+' {
			if i != 0 && s[i-1] != 'e' && s[i-1] != 'E' {
				return false
			}
		} else {
			return false
		}
	}
	return isNum
}
