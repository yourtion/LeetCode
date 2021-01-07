package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210107(t *testing.T) {
	type params struct {
		para [][]int
		ans  int
	}
	qs := []params{
		{
			para: [][]int{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}},
			ans:  2,
		},
		{
			para: [][]int{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}},
			ans:  3,
		},
	}

	utils.Segmentation("20210107")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := findCircleNum(p)
		fmt.Printf("【input】:%v \t【output】:%v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
