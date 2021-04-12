package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210412(t *testing.T) {
	type params struct {
		para []int
		ans  string
	}
	qs := []params{
		{
			para: []int{10, 2},
			ans:  "210",
		},
		{
			para: []int{3, 30, 34, 5, 9},
			ans:  "9534330",
		},
		{
			para: []int{1},
			ans:  "1",
		},
		{
			para: []int{10},
			ans:  "10",
		},
	}

	utils.Segmentation("20210412")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := largestNumber(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
