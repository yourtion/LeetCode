package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210531(t *testing.T) {
	type params struct {
		para int
		ans  bool
	}
	qs := []params{
		{para: 16, ans: true},
		{para: 5, ans: false},
		{para: 1, ans: true},
	}

	utils.Segmentation("20210531")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := isPowerOfFour(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
