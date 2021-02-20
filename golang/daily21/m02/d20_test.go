package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210220(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{1, 2, 2, 3, 1},
			ans:  2,
		},
		{
			para: []int{1, 2, 2, 3, 1, 4, 2},
			ans:  6,
		},
	}

	utils.Segmentation("20210220")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := findShortestSubArray(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
