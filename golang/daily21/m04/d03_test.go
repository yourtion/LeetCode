package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210403(t *testing.T) {
	type params struct {
		para1 string
		para2 string
		ans   int
	}
	qs := []params{
		{
			para1: "abcde",
			para2: "ace",
			ans:   3,
		},
		{
			para1: "abc",
			para2: "abc",
			ans:   3,
		},
		{
			para1: "abc",
			para2: "def",
			ans:   0,
		},
	}

	utils.Segmentation("20210403")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := longestCommonSubsequence(p1, p2)
		fmt.Printf("【input】: %v %v \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
