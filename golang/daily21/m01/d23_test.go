package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210123(t *testing.T) {
	type params struct {
		para1 int
		para2 [][]int
		ans   int
	}
	qs := []params{
		{
			para1: 4,
			para2: [][]int{{0, 1}, {0, 2}, {1, 2}},
			ans:   1,
		},
		{
			para1: 6,
			para2: [][]int{{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}},
			ans:   2,
		},
		{
			para1: 6,
			para2: [][]int{{0, 1}, {0, 2}, {0, 3}, {1, 2}},
			ans:   -1,
		},
		{
			para1: 5,
			para2: [][]int{{0, 1}, {0, 2}, {3, 4}, {2, 3}},
			ans:   0,
		},
	}

	utils.Segmentation("20210123")

	for _, q := range qs {
		ret, n, conn := q.ans, q.para1, q.para2
		res := makeConnected(n, conn)
		fmt.Printf("【input】: %d %v \t【output】: %v\n", n, conn, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
