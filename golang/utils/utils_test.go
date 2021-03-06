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

func TestDeepCloneIntSlice2d(t *testing.T) {
	a := [][]int{{3, 2, 1}, {1, 2, 3}}
	b := DeepCloneIntSlice2d(a)
	sort.Ints(a[0])
	t.Log(a, b)
	if b[0][0] != 3 || b[0][2] != 1 {
		t.FailNow()
	}
}
