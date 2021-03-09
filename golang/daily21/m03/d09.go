package y2021m03

// 每日一题 20210309
//
// 1047. 删除字符串中的所有相邻重复项
// Link: https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/
func removeDuplicates(S string) string {
	stack := []byte{}
	for i := range S {
		if len(stack) > 0 && stack[len(stack)-1] == S[i] {
			stack = stack[:len(stack)-1]
		} else {
			stack = append(stack, S[i])
		}
	}
	return string(stack)
}
