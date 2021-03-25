package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210310(t *testing.T) {
	type params struct {
		para string
		ans  int
	}
	qs := []params{
		{
			para: "1 + 1",
			ans:  2,
		},
		{
			para: " 2-1 + 2 ",
			ans:  3,
		},
		{
			para: "(1+(4+5+2)-3)+(6+8)",
			ans:  23,
		},
	}

	utils.Segmentation("20210310")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := calculate(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
