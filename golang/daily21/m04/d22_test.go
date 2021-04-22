package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210422(t *testing.T) {
	type params struct {
		para1 [][]int
		para2 int
		ans   int
	}
	qs := []params{
		{
			para1: [][]int{{1, 0, 1}, {0, -2, 3}},
			para2: 2,
			ans:   2,
		},
		{
			para1: [][]int{{2, 2, -1}},
			para2: 3,
			ans:   3,
		},
	}

	utils.Segmentation("20210422")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := maxSumSubmatrix(p1, p2)
		fmt.Printf("【input】: %v %v \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
