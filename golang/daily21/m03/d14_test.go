package y2021m03

import (
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210314(t *testing.T) {
	utils.Segmentation("20210314")

	myHashMap := ConstructorMyHashMap()
	myHashMap.Put(1, 1)
	myHashMap.Put(2, 2)
	if myHashMap.Get(1) != 1 {
		t.FailNow()
	}
	if myHashMap.Get(3) != -1 {
		t.FailNow()
	}
	myHashMap.Put(2, 1)
	if myHashMap.Get(2) != 1 {
		t.FailNow()
	}
	myHashMap.Remove(2)
	if myHashMap.Get(2) != -1 {
		t.FailNow()
	}
}
