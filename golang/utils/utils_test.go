package utils

import (
	"sort"
	"testing"
)

func TestSegmentation(t *testing.T) {
	Segmentation("test")
}

func TestDeepEqual(t *testing.T) {
	ret := DeepEqual([]int{1, 2, 3}, []int{1, 2, 3})
	if !ret {
		t.FailNow()
	}
}

func TestDeepCloneIntSlice(t *testing.T) {
	a := []int{3, 2, 1}
	b := DeepCloneIntSlice(a)
	sort.Ints(a)
	t.Log(a, b)
	if b[0] != 3 || b[2] != 1 {
		t.FailNow()
	}
}
