package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210523(t *testing.T) {
	type params struct {
		para1 []int
		para2 [][]int
		ans   []int
	}
	qs := []params{
		{
			para1: []int{0, 1, 2, 3, 4},
			para2: [][]int{{3, 1}, {1, 3}, {5, 6}},
			ans:   []int{3, 3, 7},
		},
		{
			para1: []int{5, 2, 4, 6, 6, 3},
			para2: [][]int{{12, 4}, {8, 1}, {6, 3}},
			ans:   []int{15, -1, 5},
		},
	}

	utils.Segmentation("20210523")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := maximizeXor(utils.DeepCloneIntSlice(p1), p2)
		fmt.Printf("【input】: %v %v \t【output】: %v\n", p1, p2, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
