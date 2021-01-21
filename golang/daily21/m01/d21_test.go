package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210121(t *testing.T) {
	type params struct {
		para1 int
		para2 [][]int
		ans   [][]int
	}
	qs := []params{
		{
			para1: 5,
			para2: [][]int{{0, 1, 1}, {1, 2, 1}, {2, 3, 2}, {0, 3, 2}, {0, 4, 3}, {3, 4, 3}, {1, 4, 6}},
			ans:   [][]int{{0, 1}, {2, 3, 4, 5}},
		},
		{
			para1: 4,
			para2: [][]int{{0, 1, 1}, {1, 2, 1}, {2, 3, 1}, {0, 3, 1}},
			ans:   [][]int{{}, {0, 1, 2, 3}},
		},
	}

	utils.Segmentation("20210121")

	for _, q := range qs {
		ret, n, edges := q.ans, q.para1, q.para2
		res := findCriticalAndPseudoCriticalEdges(n, edges)
		fmt.Printf("【input】:%d %v \t【output】:%v\n", n, edges, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
