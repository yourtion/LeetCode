package y2021m05

// 每日一题 20210522
//
// 810. 黑板异或游戏
// Link: https://leetcode-cn.com/problems/chalkboard-xor-game/
func xorGame(nums []int) bool {
	if len(nums)%2 == 0 {
		return true
	}
	xor := 0
	for _, num := range nums {
		xor ^= num
	}
	return xor == 0
}
