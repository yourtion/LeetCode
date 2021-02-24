package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210224(t *testing.T) {
	type params struct {
		para [][]int
		ans  [][]int
	}
	qs := []params{
		{
			para: [][]int{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}},
			ans:  [][]int{{1, 0, 0}, {0, 1, 0}, {1, 1, 1}},
		},
		{
			para: [][]int{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}},
			ans:  [][]int{{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}},
		},
	}

	utils.Segmentation("20210224")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := flipAndInvertImage(utils.DeepCloneIntSlice2d(p))
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
