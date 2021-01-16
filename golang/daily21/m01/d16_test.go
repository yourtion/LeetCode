package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210116(t *testing.T) {
	type params struct {
		para1 [][]int
		para2 [][]int
		ans   []int
	}
	qs := []params{
		{
			para1: [][]int{{1, 0, 0, 0}, {1, 1, 1, 0}},
			para2: [][]int{{1, 0}},
			ans:   []int{2},
		},
		{
			para1: [][]int{{1, 0, 0, 0}, {1, 1, 0, 0}},
			para2: [][]int{{1, 1}, {1, 0}},
			ans:   []int{0, 0},
		},
	}

	utils.Segmentation("20210116")

	for _, q := range qs {
		ret, grid, hits := q.ans, q.para1, q.para2
		res := hitBricks(grid, hits)
		fmt.Printf("【input】:%v %v \t【output】:%v\n", grid, hits, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
