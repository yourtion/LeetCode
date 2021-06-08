package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210608(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{2, 7, 4, 1, 8, 1},
			ans:  1,
		},
		{
			para: []int{31, 26, 33, 21, 40},
			ans:  5,
		},
		{
			para: []int{1, 2},
			ans:  1,
		},
	}

	utils.Segmentation("20210608")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := lastStoneWeightII(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
