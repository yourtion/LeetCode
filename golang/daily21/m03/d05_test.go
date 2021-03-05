package y2021m03

import (
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210305(t *testing.T) {
	utils.Segmentation("20210305")
	myQueue := ConstructorMyQueue()
	myQueue.Push(1)
	myQueue.Push(2)
	if myQueue.Peek() != 1 {
		t.FailNow()
	}
	if myQueue.Pop() != 1 {
		t.FailNow()
	}
	if myQueue.Empty() != false {
		t.FailNow()
	}
}
