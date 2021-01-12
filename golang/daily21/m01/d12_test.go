package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210112(t *testing.T) {
	type params struct {
		n           int
		m           int
		group       []int
		beforeItems [][]int
		ans         []int
	}
	qs := []params{
		{
			n:           8,
			m:           2,
			group:       []int{-1, -1, 1, 0, 0, 1, 0, -1},
			beforeItems: [][]int{{}, {6}, {5}, {6}, {3, 6}, {}, {}, {}},
			ans:         []int{6, 3, 4, 5, 2, 0, 7, 1},
		},
		{
			n:           8,
			m:           2,
			group:       []int{-1, -1, 1, 0, 0, 1, 0, -1},
			beforeItems: [][]int{{}, {6}, {5}, {6}, {3}, {}, {4}, {}},
			ans:         []int{},
		},
	}

	utils.Segmentation("20210112")

	for _, q := range qs {
		ret := q.ans
		res := sortItems(q.n, q.m, q.group, q.beforeItems)
		fmt.Printf("【input】:%d %d %v %v \t【output】:%v\n", q.n, q.m, q.group, q.beforeItems, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
