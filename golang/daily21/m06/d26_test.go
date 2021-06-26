package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210626(t *testing.T) {
	type params struct {
		para [][]int
		ans  int
	}
	qs := []params{
		{para: [][]int{{1, 2, 3}, {4, 0, 5}}, ans: 1},
		{para: [][]int{{1, 2, 3}, {5, 4, 0}}, ans: -1},
		{para: [][]int{{4, 1, 2}, {5, 0, 3}}, ans: 5},
		{para: [][]int{{3, 2, 4}, {1, 5, 0}}, ans: 14},
	}

	utils.Segmentation("20210626")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := slidingPuzzle(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
