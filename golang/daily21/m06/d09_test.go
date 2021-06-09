package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210609(t *testing.T) {
	type params struct {
		para1 int
		para2 int
		para3 []int
		para4 []int
		ans   int
	}
	qs := []params{
		{para1: 5, para2: 3, para3: []int{2, 2}, para4: []int{2, 3}, ans: 2},
		{para1: 10, para2: 5, para3: []int{2, 3, 5}, para4: []int{6, 7, 8}, ans: 7},
	}

	utils.Segmentation("20210609")

	for _, q := range qs {
		ret, p1, p2, p3, p4 := q.ans, q.para1, q.para2, q.para3, q.para4
		res := profitableSchemes(p1, p2, p3, p4)
		fmt.Printf("【input】: %d %d %v %v \t【output】: %v\n", p1, p2, p3, p4, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
