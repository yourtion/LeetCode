package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210508(t *testing.T) {
	type params struct {
		para1 []int
		para2 int
		ans   int
	}
	qs := []params{
		{
			para1: []int{3, 2, 3},
			para2: 3,
			ans:   3,
		},
		{
			para1: []int{1, 2, 4, 7, 8},
			para2: 2,
			ans:   11,
		},
	}

	utils.Segmentation("20210508")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := minimumTimeRequired(p1, p2)
		fmt.Printf("【input】: %v %d \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
