package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210628(t *testing.T) {
	type params struct {
		para1 [][]int
		para2 int
		para3 int
		ans   int
	}
	qs := []params{
		{para1: [][]int{{1, 2, 7}, {3, 6, 7}}, para2: 1, para3: 6, ans: 2},
		{para1: [][]int{{7, 12}, {4, 5, 15}, {6}, {15, 19}, {9, 12, 13}}, para2: 15, para3: 12, ans: -1},
	}

	utils.Segmentation("20210628")

	for _, q := range qs {
		ret, p1, p2, p3 := q.ans, q.para1, q.para2, q.para3
		res := numBusesToDestination(p1, p2, p3)
		fmt.Printf("【input】: %v %d %d  \t【output】: %v\n", p1, p2, p3, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
