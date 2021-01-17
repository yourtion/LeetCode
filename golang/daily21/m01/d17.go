package y2021m01

// 每日一题 20210117
//
// 1232. 缀点成线
// Link: https://leetcode-cn.com/problems/check-if-it-is-a-straight-line/
func checkStraightLine(coordinates [][]int) bool {
	if len(coordinates) < 2 {
		return false
	}
	dX, dY := coordinates[0][0], coordinates[0][1]
	for _, p := range coordinates {
		p[0] -= dX
		p[1] -= dY
	}
	A, B := coordinates[1][1], -coordinates[1][0]
	for _, p := range coordinates[2:] {
		x, y := p[0], p[1]
		if A*x+B*y != 0 {
			return false
		}
	}
	return true
}
