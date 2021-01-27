package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210127(t *testing.T) {
	type params struct {
		para1 int
		para2 [][]int
		ans   int
	}
	qs := []params{
		{
			para1: 4,
			para2: [][]int{{3, 1, 2}, {3, 2, 3}, {1, 1, 3}, {1, 2, 4}, {1, 1, 2}, {2, 3, 4}},
			ans:   2,
		},
		{
			para1: 4,
			para2: [][]int{{3, 1, 2}, {3, 2, 3}, {1, 1, 4}, {2, 1, 4}},
			ans:   0,
		},
		{
			para1: 4,
			para2: [][]int{{3, 2, 3}, {1, 1, 2}, {2, 3, 4}},
			ans:   -1,
		},
	}

	utils.Segmentation("20210127")

	for _, q := range qs {
		ret, n, edges := q.ans, q.para1, q.para2
		res := maxNumEdgesToRemove(n, edges)
		fmt.Printf("【input】: %d %v \t【output】: %v\n", n, edges, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
