package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210215(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{1, 1, 0, 1, 1, 1},
			ans:  3,
		},
	}

	utils.Segmentation("20210215")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := findMaxConsecutiveOnes(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
