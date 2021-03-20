package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210320(t *testing.T) {
	type params struct {
		para []string
		ans  int
	}
	qs := []params{
		{
			para: []string{"2", "1", "+", "3", "*"},
			ans:  9,
		},
		{
			para: []string{"4", "13", "5", "/", "+"},
			ans:  6,
		},
	}

	utils.Segmentation("20210320")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := evalRPN(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
