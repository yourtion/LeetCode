package y2021m03

// 每日一题 20210310
//
// 224. 基本计算器
// Link: https://leetcode-cn.com/problems/basic-calculator/
func calculate(s string) int {
	ops := []int{1}
	sign := 1
	n := len(s)
	ret := 0
	for i := 0; i < n; {
		switch s[i] {
		case ' ':
			i++
		case '+':
			sign = ops[len(ops)-1]
			i++
		case '-':
			sign = -ops[len(ops)-1]
			i++
		case '(':
			ops = append(ops, sign)
			i++
		case ')':
			ops = ops[:len(ops)-1]
			i++
		default:
			num := 0
			for ; i < n && '0' <= s[i] && s[i] <= '9'; i++ {
				num = num*10 + int(s[i]-'0')
			}
			ret += sign * num
		}
	}
	return ret
}
