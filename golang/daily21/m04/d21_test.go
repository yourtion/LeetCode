package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210421(t *testing.T) {
	type params struct {
		para string
		ans  int
	}
	qs := []params{
		{
			para: "12",
			ans:  2,
		},
		{
			para: "226",
			ans:  3,
		},
		{
			para: "0",
			ans:  0,
		},
		{
			para: "06",
			ans:  0,
		},
	}

	utils.Segmentation("20210421")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := numDecodings(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
