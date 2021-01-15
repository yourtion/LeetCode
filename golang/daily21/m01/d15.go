package y2021m01

// 每日一题 20210115
//
// 947. 移除最多的同行或同列石头
// Link: https://leetcode-cn.com/problems/most-stones-removed-with-same-row-or-column/
func removeStones(stones [][]int) int {
	n := len(stones)
	rowCol := map[int][]int{}
	for i, p := range stones {
		x, y := p[0], p[1]+10000
		rowCol[x] = append(rowCol[x], i)
		rowCol[y] = append(rowCol[y], i)
	}

	graph := make([][]int, n)
	for _, id := range rowCol {
		for i := 1; i < len(id); i++ {
			v, w := id[i-1], id[i]
			graph[v] = append(graph[v], w)
			graph[w] = append(graph[w], v)
		}
	}

	vis := make([]bool, n)
	var dfs func(int)
	dfs = func(v int) {
		vis[v] = true
		for _, w := range graph[v] {
			if !vis[w] {
				dfs(w)
			}
		}
	}
	ret := 0
	for i, v := range vis {
		if !v {
			ret++
			dfs(i)
		}
	}
	return n - ret
}
