package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210405(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		para3 []int
		para4 int
		ans   []int
	}
	qs := []params{
		{
			para1: []int{1, 2, 3, 0, 0, 0},
			para2: 3,
			para3: []int{2, 5, 6},
			para4: 3,
			ans:   []int{1, 2, 2, 3, 5, 6},
		},
		{
			para1: []int{1},
			para2: 1,
			para3: []int{},
			para4: 0,
			ans:   []int{1},
		},
		{
			para1: []int{7, 0, 0, 0, 0, 0},
			para2: 1,
			para3: []int{1, 2, 5, 6, 7},
			para4: 5,
			ans:   []int{1, 2, 5, 6, 7, 7},
		},
	}

	utils.Segmentation("20210405")

	for _, q := range qs {
		ret, p1, p2, p3, p4 := q.ans, q.para1, q.para2, q.para3, q.para4
		res := utils.DeepCloneIntSlice(p1)
		merge(res, p2, p3, p4)
		fmt.Printf("【input】: %v %d,%v,%d \t【output】: %v\n", p1, p2, p3, p4, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
