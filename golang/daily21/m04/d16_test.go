package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210416(t *testing.T) {
	type params struct {
		para1 string
		para2 string
		ans   bool
	}
	qs := []params{
		{
			para1: "great",
			para2: "rgeat",
			ans:   true,
		},
		{
			para1: "abcde",
			para2: "caebd",
			ans:   false,
		},
		{
			para1: "a",
			para2: "a",
			ans:   true,
		},
	}

	utils.Segmentation("20210416")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := isScramble(p1, p2)
		fmt.Printf("【input】: %v %v \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
