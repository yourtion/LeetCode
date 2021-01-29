package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210129(t *testing.T) {
	type params struct {
		para [][]int
		ans  int
	}
	qs := []params{
		{
			para: [][]int{{1, 2, 2}, {3, 8, 2}, {5, 3, 5}},
			ans:  2,
		},
		{
			para: [][]int{{1, 2, 3}, {3, 8, 4}, {5, 3, 5}},
			ans:  1,
		},
		{
			para: [][]int{{1, 2, 1, 1, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 1, 1, 2, 1}},
			ans:  0,
		},
	}

	utils.Segmentation("20210129")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := minimumEffortPath(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
