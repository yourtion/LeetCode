package y2021m03

import (
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210313(t *testing.T) {

	utils.Segmentation("20210313")

	myHashSet := ConstructorMyHashSet()
	myHashSet.Add(1)
	myHashSet.Add(2)
	if myHashSet.Contains(1) != true {
		t.FailNow()
	}
	if myHashSet.Contains(3) != false {
		t.FailNow()
	}
	myHashSet.Add(2)
	if myHashSet.Contains(2) != true {
		t.FailNow()
	}
	myHashSet.Remove(2)
	if myHashSet.Contains(2) != false {
		t.FailNow()
	}
}
