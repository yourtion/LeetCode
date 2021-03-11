package y2021m03

// 每日一题 20210311
//
// 227. 基本计算器 II
// Link: https://leetcode-cn.com/problems/basic-calculator-ii/
func calculate2(s string) int {
	stack := []int{}
	preSign := '+'
	num := 0
	for i, ch := range s {
		isDigit := '0' <= ch && ch <= '9'
		if isDigit {
			num = num*10 + int(ch-'0')
		}
		if !isDigit && ch != ' ' || i == len(s)-1 {
			switch preSign {
			case '+':
				stack = append(stack, num)
			case '-':
				stack = append(stack, -num)
			case '*':
				stack[len(stack)-1] *= num
			default:
				stack[len(stack)-1] /= num
			}
			preSign = ch
			num = 0
		}
	}
	ret := 0
	for _, v := range stack {
		ret += v
	}
	return ret
}
