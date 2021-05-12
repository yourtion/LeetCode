package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210512(t *testing.T) {
	type params struct {
		para1 []int
		para2 [][]int
		ans   []int
	}
	qs := []params{
		{
			para1: []int{1, 3, 4, 8},
			para2: [][]int{{0, 1}, {1, 2}, {0, 3}, {3, 3}},
			ans:   []int{2, 7, 14, 8},
		},
		{
			para1: []int{4, 8, 2, 10},
			para2: [][]int{{2, 3}, {1, 3}, {0, 0}, {0, 3}},
			ans:   []int{8, 0, 4, 4},
		},
	}

	utils.Segmentation("20210512")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := xorQueries(p1, p2)
		fmt.Printf("【input】: %v %v \t【output】: %v\n", p1, p2, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
