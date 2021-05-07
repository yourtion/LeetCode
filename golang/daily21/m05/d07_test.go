package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210507(t *testing.T) {
	type params struct {
		para1 int
		para2 int
		ans   int
	}
	qs := []params{
		{para1: 5, para2: 0, ans: 8},
		{para1: 4, para2: 3, ans: 8},
		{para1: 1, para2: 7, ans: 7},
		{para1: 10, para2: 5, ans: 2},
	}

	utils.Segmentation("20210507")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := xorOperation(p1, p2)
		fmt.Printf("【input】: %v %v  \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
