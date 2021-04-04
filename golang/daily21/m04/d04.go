package y2021m04

// 每日一题 20210404
//
// 781. 森林中的兔子
// Link: https://leetcode-cn.com/problems/rabbits-in-forest/
func numRabbits(answers []int) int {
	maps := map[int]int{}
	ret := 0
	for _, answer := range answers {
		num, ok := maps[answer]
		if !ok || num < 1 {
			ret += answer + 1
			maps[answer] = answer
		} else if ok {
			maps[answer] -= 1
		}
	}
	return ret
}
