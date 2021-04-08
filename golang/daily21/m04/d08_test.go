package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210408(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{3, 4, 5, 1, 2},
			ans:  1,
		},
		{
			para: []int{4, 5, 6, 7, 0, 1, 2},
			ans:  0,
		},
		{
			para: []int{11, 13, 15, 17},
			ans:  11,
		},
	}

	utils.Segmentation("20210408")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := findMin(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
