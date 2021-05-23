package y2021m05

import "sort"

// 每日一题 20210523
//
// 1707. 与数组中元素的最大异或值
// Link: https://leetcode-cn.com/problems/maximum-xor-with-an-element-from-array/
func maximizeXor(nums []int, queries [][]int) []int {
	const L = 30
	type trie struct {
		children [2]*trie
	}
	trieInsert := func(t *trie, val int) {
		node := t
		for i := L - 1; i >= 0; i-- {
			bit := val >> i & 1
			if node.children[bit] == nil {
				node.children[bit] = &trie{}
			}
			node = node.children[bit]
		}
	}
	trieGetMaxXor := func(t *trie, val int) (ans int) {
		node := t
		for i := L - 1; i >= 0; i-- {
			bit := val >> i & 1
			if node.children[bit^1] != nil {
				ans |= 1 << i
				bit ^= 1
			}
			node = node.children[bit]
		}
		return
	}

	sort.Ints(nums)
	for i := range queries {
		queries[i] = append(queries[i], i)
	}
	sort.Slice(queries, func(i, j int) bool { return queries[i][1] < queries[j][1] })

	ans := make([]int, len(queries))
	t := &trie{}
	idx, n := 0, len(nums)
	for _, q := range queries {
		x, m, qid := q[0], q[1], q[2]
		for idx < n && nums[idx] <= m {
			trieInsert(t, nums[idx])
			idx++
		}
		if idx == 0 { // 字典树为空
			ans[qid] = -1
		} else {
			ans[qid] = trieGetMaxXor(t, x)
		}
	}
	return ans
}
