package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210504(t *testing.T) {
	type params struct {
		para1 []int
		para2 [][]int
		para3 int
		para4 int
		para5 int
		ans   int
	}
	qs := []params{
		{
			para1: []int{0, 0, 0, 0, 0},
			para2: [][]int{{1, 10}, {10, 1}, {10, 1}, {1, 10}, {5, 1}},
			para3: 5, para4: 2, para5: 3,
			ans: 9,
		},
		{
			para1: []int{0, 2, 1, 2, 0},
			para2: [][]int{{1, 10}, {10, 1}, {10, 1}, {1, 10}, {5, 1}},
			para3: 5, para4: 2, para5: 3,
			ans: 11,
		},
		{
			para1: []int{0, 0, 0, 0, 0},
			para2: [][]int{{1, 10}, {10, 1}, {1, 10}, {10, 1}, {1, 10}},
			para3: 5, para4: 2, para5: 5,
			ans: 5,
		},
		{
			para1: []int{3, 1, 2, 3},
			para2: [][]int{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}},
			para3: 4, para4: 3, para5: 3,
			ans: -1,
		},
	}

	utils.Segmentation("20210504")

	for _, q := range qs {
		ret, p1, p2, p3, p4, p5 := q.ans, q.para1, q.para2, q.para3, q.para4, q.para5
		res := minCost(p1, p2, p3, p4, p5)
		fmt.Printf("【input】: %v %v %d %d %d \t【output】: %v\n", p1, p2, p3, p4, p5, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
