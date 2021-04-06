package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210406(t *testing.T) {
	type params struct {
		para []int
		ans  []int
	}
	qs := []params{
		{
			para: []int{1, 1, 1, 2, 2, 3},
			ans:  []int{1, 1, 2, 2, 3},
		},
		{
			para: []int{0, 0, 1, 1, 1, 1, 2, 3, 3},
			ans:  []int{0, 0, 1, 1, 2, 3, 3},
		},
	}

	utils.Segmentation("20210406")

	for _, q := range qs {
		ret, p := q.ans, q.para
		pd := utils.DeepCloneIntSlice(p)
		res1 := removeDuplicates2(pd)
		res := pd[:res1]
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
