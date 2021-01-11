package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210111(t *testing.T) {
	type params struct {
		para1 string
		para2 [][]int
		ans   string
	}
	qs := []params{
		{
			para1: "dcab",
			para2: [][]int{{0, 3}, {1, 2}},
			ans:   "bacd",
		},
		{
			para1: "dcab",
			para2: [][]int{{0, 3}, {1, 2}, {0, 2}},
			ans:   "abcd",
		},
	}

	utils.Segmentation("20210111")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := smallestStringWithSwaps(p1, p2)
		fmt.Printf("【input】:%v %v \t【output】:%v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
