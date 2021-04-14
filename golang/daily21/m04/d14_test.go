package y2021m04

import (
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210414(t *testing.T) {

	utils.Segmentation("20210414")

	trie := ConstructorTrie()
	trie.Insert("apple")
	if trie.Search("apple") != true {
		t.FailNow()
	}
	if trie.Search("app") != false {
		t.FailNow()
	}
	if trie.StartsWith("app") != true {
		t.FailNow()
	}
	trie.Insert("app")
	if trie.Search("app") != true {
		t.FailNow()
	}
}
