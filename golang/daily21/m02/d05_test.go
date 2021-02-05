package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210205(t *testing.T) {
	type params struct {
		para1 string
		para2 string
		para3 int
		ans   int
	}
	qs := []params{
		{
			para1: "abcd",
			para2: "bcdf",
			para3: 3,
			ans:   3,
		},
		{
			para1: "abcd",
			para2: "cdef",
			para3: 3,
			ans:   1,
		},
		{
			para1: "abcd",
			para2: "acde",
			para3: 0,
			ans:   1,
		},
	}

	utils.Segmentation("20210205")

	for _, q := range qs {
		ret, s1, s2, cost := q.ans, q.para1, q.para2, q.para3
		res := equalSubstring(s1, s2, cost)
		fmt.Printf("【input】: %s %s %d  \t【output】: %v\n", s1, s2, cost, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
