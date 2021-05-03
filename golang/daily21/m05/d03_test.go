package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210503(t *testing.T) {
	type params struct {
		para int
		ans  int
	}
	qs := []params{
		{para: 123, ans: 321},
		{para: -123, ans: -321},
		{para: 120, ans: 21},
		{para: 0, ans: 0},
	}

	utils.Segmentation("20210503")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := reverse(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
