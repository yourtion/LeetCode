package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210606(t *testing.T) {
	type params struct {
		para1 []string
		para2 int
		para3 int
		ans   int
	}
	qs := []params{
		{
			para1: []string{"10", "0001", "111001", "1", "0"},
			para2: 5, para3: 3, ans: 4,
		},
		{
			para1: []string{"10", "0", "1"},
			para2: 1, para3: 1, ans: 2,
		},
	}

	utils.Segmentation("20210606")

	for _, q := range qs {
		ret, p1, p2, p3 := q.ans, q.para1, q.para2, q.para3
		res := findMaxForm(p1, p2, p3)
		fmt.Printf("【input】: %v %d %d \t【output】: %v\n", p1, p2, p3, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
