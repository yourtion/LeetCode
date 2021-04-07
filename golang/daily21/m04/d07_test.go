package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210407(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   bool
	}
	qs := []params{
		{
			para1: []int{2, 5, 6, 0, 0, 1, 2},
			para2: 0,
			ans:   true,
		},
		{
			para1: []int{2, 5, 6, 0, 0, 1, 2},
			para2: 3,
			ans:   false,
		},
		{
			para1: []int{},
			para2: 3,
			ans:   false,
		},
		{
			para1: []int{2, 2, 2, 3, 2, 2, 2},
			para2: 3,
			ans:   true,
		},
	}

	utils.Segmentation("20210407")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := search(p1, p2)
		fmt.Printf("【input】: %v %d \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
