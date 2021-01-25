package y2021m01

// 每日一题 20210125
//
// 959. 由斜杠划分区域
// Link: https://leetcode-cn.com/problems/regions-cut-by-slashes/
func regionsBySlashes(grid []string) int {
	n := len(grid)
	// 并查集
	setCount := 4 * n * n
	parent := make([]int, setCount)
	size := make([]int, setCount)
	for i := range parent {
		parent[i] = i
		size[i] = 1
	}
	var find func(x int) int
	find = func(x int) int {
		if parent[x] != x {
			parent[x] = find(parent[x])
		}
		return parent[x]
	}
	union := func(x, y int) {
		fx, fy := find(x), find(y)
		if fx == fy {
			return
		}
		if size[fx] < size[fy] {
			fx, fy = fy, fx
		}
		size[fx] += size[fy]
		parent[fy] = fx
		setCount--
	}
	// 计算
	for i := 0; i < n; i++ {
		for j := 0; j < n; j++ {
			idx := i*n + j
			if i < n-1 {
				bottom := idx + n
				union(idx*4+2, bottom*4)
			}
			if j < n-1 {
				right := idx + 1
				union(idx*4+1, right*4+3)
			}
			if grid[i][j] == '/' {
				union(idx*4, idx*4+3)
				union(idx*4+1, idx*4+2)
			} else if grid[i][j] == '\\' {
				union(idx*4, idx*4+1)
				union(idx*4+2, idx*4+3)
			} else {
				union(idx*4, idx*4+1)
				union(idx*4+1, idx*4+2)
				union(idx*4+2, idx*4+3)
			}
		}
	}
	return setCount
}
