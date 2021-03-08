package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210308(t *testing.T) {
	type params struct {
		para string
		ans  int
	}
	qs := []params{
		{
			para: "aab",
			ans:  1,
		},
		{
			para: "a",
			ans:  0,
		},
		{
			para: "ab",
			ans:  1,
		},
	}

	utils.Segmentation("20210308")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := minCut(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
