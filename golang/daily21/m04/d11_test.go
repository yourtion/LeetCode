package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210411(t *testing.T) {
	type params struct {
		para int
		ans  int
	}
	qs := []params{
		{para: 1, ans: 1},
		{para: 10, ans: 12},
	}

	utils.Segmentation("20210411")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := nthUglyNumber(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
