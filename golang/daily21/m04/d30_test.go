package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210430(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{2, 2, 3, 2},
			ans:  3,
		},
		{
			para: []int{0, 1, 0, 1, 0, 1, 99},
			ans:  99,
		},
	}

	utils.Segmentation("20210430")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := singleNumber(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
