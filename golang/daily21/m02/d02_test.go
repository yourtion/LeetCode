package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210202(t *testing.T) {
	type params struct {
		para1 string
		para2 int
		ans   int
	}
	qs := []params{
		{
			para1: "ABAB",
			para2: 2,
			ans:   4,
		},
		{
			para1: "AABABBA",
			para2: 1,
			ans:   4,
		},
	}

	utils.Segmentation("20210202")

	for _, q := range qs {
		ret, s, k := q.ans, q.para1, q.para2
		res := characterReplacement(s, k)
		fmt.Printf("【input】: %v %d \t【output】: %d\n", s, k, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
