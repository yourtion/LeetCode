package y2021m01

import "sort"

// 每日一题 20210118
//
// 721. 账户合并
// Link: https://leetcode-cn.com/problems/accounts-merge/
//goland:noinspection GoPreferNilSlice
func accountsMerge(accounts [][]string) [][]string {
	emailIdx := map[string]int{}
	emailName := map[string]string{}
	for _, account := range accounts {
		name := account[0]
		for _, email := range account[1:] {
			if _, has := emailIdx[email]; !has {
				emailIdx[email] = len(emailIdx)
				emailName[email] = name
			}
		}
	}
	set := make([]int, len(emailIdx))
	for i := range set {
		set[i] = i
	}
	var find func(id int) int
	find = func(id int) int {
		if set[id] != id {
			set[id] = find(set[id])
		}
		return set[id]
	}
	union := func(a, b int) {
		set[find(a)] = find(b)
	}
	for _, account := range accounts {
		firstIndex := emailIdx[account[1]]
		for _, email := range account[2:] {
			union(emailIdx[email], firstIndex)
		}
	}
	indexToEmails := map[int][]string{}
	for email, index := range emailIdx {
		index = find(index)
		indexToEmails[index] = append(indexToEmails[index], email)
	}

	ret := [][]string{}
	for _, emails := range indexToEmails {
		sort.Strings(emails)
		account := append([]string{emailName[emails[0]]}, emails...)
		ret = append(ret, account)
	}
	return ret
}
