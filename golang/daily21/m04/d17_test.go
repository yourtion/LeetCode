package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210417(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		para3 int
		ans   bool
	}
	qs := []params{
		{
			para1: []int{1, 2, 3, 1},
			para2: 3,
			para3: 0,
			ans:   true,
		},
		{
			para1: []int{1, 0, 1, 1},
			para2: 1,
			para3: 2,
			ans:   true,
		},
		{
			para1: []int{1, 5, 9, 1, 5, 9},
			para2: 2,
			para3: 3,
			ans:   false,
		},
	}

	utils.Segmentation("20210417")

	for _, q := range qs {
		ret, p1, p2, p3 := q.ans, q.para1, q.para2, q.para3
		res := containsNearbyAlmostDuplicate(p1, p2, p3)
		fmt.Printf("【input】: %v %v %v \t【output】: %v\n", p1, p2, p3, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
