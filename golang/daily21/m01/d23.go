package y2021m01

// 每日一题 20210123
//
// 1319. 连通网络的操作次数
// Link: https://leetcode-cn.com/problems/number-of-operations-to-make-network-connected/
func makeConnected(n int, connections [][]int) int {
	if len(connections) < n-1 {
		return -1
	}

	graph := make([][]int, n)
	for _, c := range connections {
		v, w := c[0], c[1]
		graph[v] = append(graph[v], w)
		graph[w] = append(graph[w], v)
	}

	vis := make([]bool, n)
	var dfs func(int)
	dfs = func(from int) {
		vis[from] = true
		for _, to := range graph[from] {
			if !vis[to] {
				dfs(to)
			}
		}
	}
	ans := 0
	for i, v := range vis {
		if !v {
			ans++
			dfs(i)
		}
	}
	return ans - 1
}
