package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210110(t *testing.T) {
	type params struct {
		para []int
		ans  []string
	}
	qs := []params{
		{
			para: []int{0, 1, 2, 4, 5, 7},
			ans:  []string{"0->2", "4->5", "7"},
		},
		{
			para: []int{0, 2, 3, 4, 6, 8, 9},
			ans:  []string{"0", "2->4", "6", "8->9"},
		},
		{
			para: []int{},
			ans:  []string{},
		},
		{
			para: []int{-1},
			ans:  []string{"-1"},
		},
		{
			para: []int{0},
			ans:  []string{"0"},
		},
	}

	utils.Segmentation("20210110")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := summaryRanges(p)
		fmt.Printf("【input】:%v \t【output】:%v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
