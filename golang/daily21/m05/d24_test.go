package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210524(t *testing.T) {
	type params struct {
		para string
		ans  int
	}
	qs := []params{
		{
			para: "aaabbb",
			ans:  2,
		},
		{
			para: "aba",
			ans:  2,
		},
	}

	utils.Segmentation("20210524")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := strangePrinter(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
