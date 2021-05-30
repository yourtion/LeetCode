package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210530(t *testing.T) {
	type params struct {
		para int
		ans  bool
	}
	qs := []params{
		{para: 2, ans: true},
		{para: 16, ans: true},
		{para: 3, ans: false},
		{para: 5, ans: false},
	}

	utils.Segmentation("20210530")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := isPowerOfTwo(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
