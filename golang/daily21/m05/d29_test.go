package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210529(t *testing.T) {
	type params struct {
		para1 [][]int
		para2 int
		ans   int
	}
	qs := []params{
		{
			para1: [][]int{{0, 1, 0}, {1, 1, 1}, {0, 1, 0}},
			para2: 0, ans: 4,
		},
		{
			para1: [][]int{{1, -1}, {-1, 1}},
			para2: 0, ans: 5,
		},
		{
			para1: [][]int{{904}},
			para2: 0, ans: 0,
		},
	}

	utils.Segmentation("20210529")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := numSubmatrixSumTarget(p1, p2)
		fmt.Printf("【input】: %v %v \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
