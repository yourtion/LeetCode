package y2021m05

import "sort"

// 每日一题 20210520
//
// 692. 前K个高频单词
// Link: https://leetcode-cn.com/problems/top-k-frequent-words/
func topKFrequent(words []string, k int) []string {
	counter := map[string]int{}
	for _, word := range words {
		counter[word] += 1
	}
	uniqueWords := make([]string, 0, len(counter))
	for w := range counter {
		uniqueWords = append(uniqueWords, w)
	}
	sort.Slice(uniqueWords, func(i, j int) bool {
		s, t := uniqueWords[i], uniqueWords[j]
		return counter[s] > counter[t] ||
			(counter[s] == counter[t] && s < t)
	})
	return uniqueWords[:k]
}
