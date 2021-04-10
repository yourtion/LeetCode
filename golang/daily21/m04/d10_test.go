package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210410(t *testing.T) {
	type params struct {
		para int
		ans  bool
	}
	qs := []params{
		{para: 6, ans: true},
		{para: 8, ans: true},
		{para: 14, ans: false},
		{para: 1, ans: true},
		{para: 0, ans: false},
	}

	utils.Segmentation("20210410")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := isUgly(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
