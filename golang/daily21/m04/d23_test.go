package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210423(t *testing.T) {
	type params struct {
		para []int
		ans  []int
	}
	qs := []params{
		{
			para: []int{1, 2, 3},
			ans:  []int{2, 1},
		},
		{
			para: []int{1, 2, 4, 8},
			ans:  []int{8, 4, 2, 1},
		},
	}

	utils.Segmentation("20210423")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := largestDivisibleSubset(utils.DeepCloneIntSlice(p))
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
