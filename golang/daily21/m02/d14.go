package y2021m02

// 每日一题 20210214
//
// 765. 情侣牵手
// Link: https://leetcode-cn.com/problems/couples-holding-hands/
func minSwapsCouples(row []int) int {
	n := len(row)
	graph := make([][]int, n/2)
	for i := 0; i < n; i += 2 {
		l, r := row[i]/2, row[i+1]/2
		if l != r {
			graph[l] = append(graph[l], r)
			graph[r] = append(graph[r], l)
		}
	}
	ret := 0
	vis := make([]bool, n/2)
	for i, vs := range vis {
		if vs {
			continue
		}
		vis[i] = true
		cnt := 0
		q := []int{i}
		for len(q) > 0 {
			cnt++
			v := q[0]
			q = q[1:]
			for _, w := range graph[v] {
				if vis[w] {
					continue
				}
				vis[w] = true
				q = append(q, w)
			}
		}
		ret += cnt - 1
	}
	return ret
}
