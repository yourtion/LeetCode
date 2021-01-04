package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210104(t *testing.T) {
	type params struct {
		para int
		ans  int
	}
	qs := []params{
		{para: 0, ans: 0},
		{para: 1, ans: 1},
		{para: 2, ans: 1},
		{para: 3, ans: 2},
		{para: 4, ans: 3},
	}

	utils.Segmentation("20210104")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := fib(p)
		fmt.Printf("【input】:%v \t【output】:%v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
