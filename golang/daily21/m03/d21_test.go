package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210321(t *testing.T) {
	type params struct {
		para [][]int
		ans  [][]int
	}
	qs := []params{
		{
			para: [][]int{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}},
			ans:  [][]int{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}},
		},
		{
			para: [][]int{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}},
			ans:  [][]int{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}},
		},
	}

	utils.Segmentation("20210321")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := utils.DeepCloneIntSlice2d(p)
		setZeroes(res)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
