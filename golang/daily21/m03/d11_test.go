package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210311(t *testing.T) {
	type params struct {
		para string
		ans  int
	}
	qs := []params{
		{
			para: "3+2*2",
			ans:  7,
		},
		{
			para: " 3/2 ",
			ans:  1,
		},
		{
			para: " 3+5 / 2 ",
			ans:  5,
		},
	}

	utils.Segmentation("20210311")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := calculate2(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
