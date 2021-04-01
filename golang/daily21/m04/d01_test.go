package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210401(t *testing.T) {
	type params struct {
		para int
		ans  int
	}
	qs := []params{
		{
			para: 4,
			ans:  7,
		},
		{
			para: 10,
			ans:  12,
		},
	}

	utils.Segmentation("20210401")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := clumsy(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
