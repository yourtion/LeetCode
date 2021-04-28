package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210428(t *testing.T) {
	type params struct {
		para int
		ans  bool
	}
	qs := []params{
		{para: 5, ans: true},
		{para: 3, ans: false},
		{para: 4, ans: true},
		{para: 2, ans: true},
		{para: 1, ans: true},
	}

	utils.Segmentation("20210428")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := judgeSquareSum(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
