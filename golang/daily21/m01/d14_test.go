package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210114(t *testing.T) {
	type params struct {
		para []int
		ans  []bool
	}
	qs := []params{
		{
			para: []int{0, 1, 1},
			ans:  []bool{true, false, false},
		},
		{
			para: []int{1, 1, 1},
			ans:  []bool{false, false, false},
		},
		{
			para: []int{0, 1, 1, 1, 1, 1},
			ans:  []bool{true, false, false, false, true, false},
		},
		{
			para: []int{1, 1, 1, 0, 1},
			ans:  []bool{false, false, false, false, false},
		},
		{
			para: []int{1, 1, 1, 0, 1},
			ans:  []bool{false, false, false, false, false},
		},
	}

	utils.Segmentation("20210114")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := prefixesDivBy5(p)
		fmt.Printf("【input】:%v \t【output】:%v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
