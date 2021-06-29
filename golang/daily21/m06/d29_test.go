package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210629(t *testing.T) {
	type params struct {
		para int
		ans  string
	}
	qs := []params{
		{para: 1, ans: "A"},
		{para: 28, ans: "AB"},
		{para: 701, ans: "ZY"},
	}

	utils.Segmentation("20210629")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := convertToTitle(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
