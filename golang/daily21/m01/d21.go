package y2021m01

import (
	"math"
	"sort"
)

// 每日一题 20210121
//
// 1489. 找到最小生成树里的关键边和伪关键边
// Link: https://leetcode-cn.com/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/
func findCriticalAndPseudoCriticalEdges(n int, edges [][]int) [][]int {
	// 并集查
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

	// 开始计算
	for i, e := range edges {
		edges[i] = append(e, i)
	}
	sort.Slice(edges, func(i, j int) bool { return edges[i][2] < edges[j][2] })

	calcMST := func(uf *unionFind, ignoreID int) (mstValue int) {
		for i, e := range edges {
			if i != ignoreID && union(uf, e[0], e[1]) {
				mstValue += e[2]
			}
		}
		if uf.setCount > 1 {
			return math.MaxInt64
		}
		return
	}

	mstValue := calcMST(newUnionFind(n), -1)

	pseudoKeyEdges := []int{}
	keyEdges := []int{}
	for i, e := range edges {
		// 是否为关键边
		if calcMST(newUnionFind(n), i) > mstValue {
			keyEdges = append(keyEdges, e[3])
			continue
		}

		// 是否为伪关键边
		uf := newUnionFind(n)
		union(uf, e[0], e[1])
		if e[2]+calcMST(uf, i) == mstValue {
			pseudoKeyEdges = append(pseudoKeyEdges, e[3])
		}
	}

	return [][]int{keyEdges, pseudoKeyEdges}
}
