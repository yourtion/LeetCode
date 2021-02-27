package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210227(t *testing.T) {
	type params struct {
		para1 string
		para2 int
		ans   int
	}
	qs := []params{
		{
			para1: "aaabb",
			para2: 3,
			ans:   3,
		},
		{
			para1: "ababbc",
			para2: 2,
			ans:   5,
		},
	}

	utils.Segmentation("20210227")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := longestSubstring(p1, p2)
		fmt.Printf("【input】: %v %v \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
