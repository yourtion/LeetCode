package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210522(t *testing.T) {
	type params struct {
		para []int
		ans  bool
	}
	qs := []params{
		{
			para: []int{1, 1, 2},
			ans:  false,
		},
	}

	utils.Segmentation("20210522")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := xorGame(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
