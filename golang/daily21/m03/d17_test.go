package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210317(t *testing.T) {
	type params struct {
		para1 string
		para2 string
		ans   int
	}
	qs := []params{
		{
			para1: "rabbbit",
			para2: "rabbit",
			ans:   3,
		},
		{
			para1: "babgbag",
			para2: "bag",
			ans:   5,
		},
	}

	utils.Segmentation("20210317")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := numDistinct(p1, p2)
		fmt.Printf("【input】: %v %v \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
