package y2021m05

// 每日一题 20210502
//
// 554. 砖墙
// Link: https://leetcode-cn.com/problems/brick-wall/
func leastBricks(wall [][]int) int {
	wallMap := map[int]int{}
	for _, widths := range wall {
		sum := 0
		for _, width := range widths[:len(widths)-1] {
			sum += width
			wallMap[sum]++
		}
	}
	maxCnt := 0
	for _, c := range wallMap {
		if c > maxCnt {
			maxCnt = c
		}
	}
	return len(wall) - maxCnt
}
