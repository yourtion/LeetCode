package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210117(t *testing.T) {
	type params struct {
		para [][]int
		ans  bool
	}
	qs := []params{
		{
			para: [][]int{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}},
			ans:  true,
		},
		{
			para: [][]int{{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}},
			ans:  false,
		},
	}

	utils.Segmentation("20210117")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := checkStraightLine(p)
		fmt.Printf("【input】:%v \t【output】:%v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
