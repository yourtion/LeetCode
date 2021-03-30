package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210330(t *testing.T) {
	type params struct {
		para1 [][]int
		para2 int
		ans   bool
	}
	qs := []params{
		{
			para1: [][]int{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}},
			para2: 3,
			ans:   true,
		},
		{
			para1: [][]int{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}},
			para2: 13,
			ans:   false,
		},
		{
			para1: [][]int{{1}},
			para2: 0,
			ans:   false,
		},
		{
			para1: [][]int{{1}},
			para2: 1,
			ans:   true,
		},
	}

	utils.Segmentation("20210330")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := searchMatrix(p1, p2)
		fmt.Printf("【input】: %v %d \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
