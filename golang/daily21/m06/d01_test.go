package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210601(t *testing.T) {
	type params struct {
		para1 []int
		para2 [][]int
		ans   []bool
	}
	qs := []params{
		{
			para1: []int{7, 4, 5, 3, 8},
			para2: [][]int{{0, 2, 2}, {4, 2, 4}, {2, 13, 1000000000}},
			ans:   []bool{true, false, true},
		},
		{
			para1: []int{5, 2, 6, 4, 1},
			para2: [][]int{{3, 1, 2}, {4, 10, 3}, {3, 10, 100}, {4, 100, 30}, {1, 3, 1}},
			ans:   []bool{false, true, true, false, false},
		},
	}

	utils.Segmentation("20210601")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := canEat(p1, p2)
		fmt.Printf("【input】: %v %v \t【output】: %v\n", p1, p2, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
