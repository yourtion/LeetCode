package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210119(t *testing.T) {
	type params struct {
		para [][]int
		ans  int
	}
	qs := []params{
		{
			para: [][]int{{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}},
			ans:  20,
		},
		{
			para: [][]int{{3, 12}, {-2, 5}, {-4, 1}},
			ans:  18,
		},
		{
			para: [][]int{{0, 0}, {1, 1}, {1, 0}, {-1, 1}},
			ans:  4,
		},
		{
			para: [][]int{{-1000000, -1000000}, {1000000, 1000000}},
			ans:  4000000,
		},
		{
			para: [][]int{{0, 0}},
			ans:  0,
		},
	}

	utils.Segmentation("20210119")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := minCostConnectPoints(p)
		fmt.Printf("【input】:%v \t【output】:%v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
