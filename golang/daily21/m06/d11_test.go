package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210611(t *testing.T) {
	type params struct {
		para int
		ans  int
	}
	qs := []params{
		{para: 12, ans: 3},
		{para: 13, ans: 2},
	}

	utils.Segmentation("20210611")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := numSquares(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
