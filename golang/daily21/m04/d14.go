package y2021m04

// Trie 每日一题 20210414
//
// 208. 实现 Trie (前缀树)
// Link: https://leetcode-cn.com/problems/implement-trie-prefix-tree/
type Trie struct {
	children []*trieNode
}

type trieNode struct {
	ok       bool
	char     rune
	word     string
	children []*trieNode
}

// ConstructorTrie Initialize your data structure here.
func ConstructorTrie() Trie {
	return Trie{children: make([]*trieNode, 26)}
}

// Insert Inserts a word into the trie.
func (t *Trie) Insert(word string) {
	nodes := t.children
	n := nodes[0]
	for _, char := range word {
		n = nodes[char-'a']
		if n == nil {
			nodes[char-'a'] = &trieNode{ok: true, char: char, children: make([]*trieNode, 26)}
			n = nodes[char-'a']
		}
		nodes = n.children
	}
	n.word = word
}

// Search Returns if the word is in the trie.
func (t *Trie) Search(word string) bool {
	nodes := t.children
	n := nodes[0]
	for _, char := range word {
		n = nodes[char-'a']
		if n == nil || !n.ok {
			return false
		}
		nodes = n.children
	}
	return n.word == word
}

// StartsWith Returns if there is any word in the trie that starts with the given prefix.
func (t *Trie) StartsWith(prefix string) bool {
	nodes := t.children
	for _, char := range prefix {
		n := nodes[char-'a']
		if n == nil || !n.ok {
			return false
		}
		nodes = n.children
	}
	return true
}
