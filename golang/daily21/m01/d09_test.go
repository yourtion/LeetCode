package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210109(t *testing.T) {
	type params struct {
		para []int
		ans  int
	}
	qs := []params{
		{
			para: []int{3, 3, 5, 0, 0, 3, 1, 4},
			ans:  6,
		},
		{
			para: []int{1, 2, 3, 4, 5},
			ans:  4,
		},
	}

	utils.Segmentation("20210109")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := maxProfit(p)
		fmt.Printf("【input】:%v \t【output】:%v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
