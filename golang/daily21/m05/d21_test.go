package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210521(t *testing.T) {
	type params struct {
		para1 []int
		para2 []int
		ans   int
	}
	qs := []params{
		{
			para1: []int{1, 4, 2},
			para2: []int{1, 2, 4},
			ans:   2,
		},
		{
			para1: []int{2, 5, 1, 2, 5},
			para2: []int{10, 5, 2, 1, 5, 2},
			ans:   3,
		},
		{
			para1: []int{1, 3, 7, 1, 7, 5},
			para2: []int{1, 9, 2, 5, 1},
			ans:   2,
		},
	}

	utils.Segmentation("20210521")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := maxUncrossedLines(p1, p2)
		fmt.Printf("【input】: %v %v \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
