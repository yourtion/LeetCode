package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210614(t *testing.T) {
	type params struct {
		para int
		ans  int
	}
	qs := []params{
		{para: 10, ans: 6},
		{para: 1, ans: 1},
		{para: 2, ans: 1},
		{para: 2, ans: 2},
	}

	utils.Segmentation("20210614")

	for _, q := range qs {
		ret, p := q.ans, q.para
		guess = func(v int) int {
			if v == ret {
				return 0
			} else if v > ret {
				return -1
			} else {
				return 1
			}
		}
		res := guessNumber(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
