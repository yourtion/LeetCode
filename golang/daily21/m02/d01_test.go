package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210201(t *testing.T) {
	type params struct {
		para1 []int
		para2 []int
		ans   []int
	}
	qs := []params{
		{
			para1: []int{1, 1},
			para2: []int{2, 2},
			ans:   []int{1, 2},
		},
		{
			para1: []int{1, 2},
			para2: []int{2, 3},
			ans:   []int{1, 2},
		},
		{
			para1: []int{2},
			para2: []int{2, 3},
			ans:   []int{2, 3},
		},
		{
			para1: []int{1, 2, 5},
			para2: []int{2, 4},
			ans:   []int{5, 4},
		},
	}

	utils.Segmentation("20210201")

	for _, q := range qs {
		ret, a, b := q.ans, q.para1, q.para2
		res := fairCandySwap(a, b)
		fmt.Printf("【input】: %v %v \t【output】: %v\n", a, b, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
