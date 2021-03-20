package y2021m03

import "strconv"

// 每日一题 20210320
//
// 150. 逆波兰表达式求值
// Link: https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/
func evalRPN(tokens []string) int {
	stack := []int{}
	for _, token := range tokens {
		if val, err := strconv.Atoi(token); err == nil {
			stack = append(stack, val)
			continue
		}
		num1, num2 := stack[len(stack)-2], stack[len(stack)-1]
		stack = stack[:len(stack)-2]
		switch token {
		case "+":
			stack = append(stack, num1+num2)
		case "-":
			stack = append(stack, num1-num2)
		case "*":
			stack = append(stack, num1*num2)
		case "/":
			stack = append(stack, num1/num2)
		default:
			continue
		}
	}
	return stack[0]
}
