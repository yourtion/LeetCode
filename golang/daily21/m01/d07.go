package y2021m01

// 每日一题 20210107
//
// 547. 省份数量
// Link: https://leetcode-cn.com/problems/number-of-provinces/
func findCircleNum(isConnected [][]int) int {
	vis := make([]bool, len(isConnected))
	ans := 0
	for i, v := range vis {
		if !v {
			ans++
			queue := []int{i}
			for len(queue) > 0 {
				from := queue[0]
				queue = queue[1:]
				vis[from] = true
				for to, conn := range isConnected[from] {
					if conn == 1 && !vis[to] {
						queue = append(queue, to)
					}
				}
			}
		}
	}
	return ans
}
