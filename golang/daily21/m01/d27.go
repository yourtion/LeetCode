package y2021m01

// 每日一题 20210127
//
// 1579. 保证图可完全遍历
// Link: https://leetcode-cn.com/problems/remove-max-number-of-edges-to-keep-graph-fully-traversable/
func maxNumEdgesToRemove(n int, edges [][]int) int {
	type unionFind struct {
		parent, size []int
		setCount     int // 当前连通分量数目
	}
	newUnionFind := func(n int) *unionFind {
		parent := make([]int, n)
		size := make([]int, n)
		for i := range parent {
			parent[i] = i
			size[i] = 1
		}
		return &unionFind{parent, size, n}
	}
	var find func(uf *unionFind, x int) int
	find = func(uf *unionFind, x int) int {
		if uf.parent[x] != x {
			uf.parent[x] = find(uf, uf.parent[x])
		}
		return uf.parent[x]
	}

	union := func(uf *unionFind, x, y int) bool {
		fx, fy := find(uf, x), find(uf, y)
		if fx == fy {
			return false
		}
		if uf.size[fx] < uf.size[fy] {
			fx, fy = fy, fx
		}
		uf.size[fx] += uf.size[fy]
		uf.parent[fy] = fx
		uf.setCount--
		return true
	}

	inSameSet := func(uf *unionFind, x, y int) bool {
		return find(uf, x) == find(uf, y)
	}

	ans := len(edges)
	alice, bob := newUnionFind(n), newUnionFind(n)
	for _, e := range edges {
		x, y := e[1]-1, e[2]-1
		if e[0] == 3 && (!inSameSet(alice, x, y) || !inSameSet(bob, x, y)) {
			// 保留这条公共边
			union(alice, x, y)
			union(bob, x, y)
			ans--
		}
	}
	uf := [2]*unionFind{alice, bob}
	for _, e := range edges {
		if tp := e[0]; tp < 3 && union(uf[tp-1], e[1]-1, e[2]-1) {
			// 保留这条独占边
			ans--
		}
	}
	if alice.setCount > 1 || bob.setCount > 1 {
		return -1
	}
	return ans
}
