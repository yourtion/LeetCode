package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210618(t *testing.T) {
	type params struct {
		para string
		ans  string
	}
	qs := []params{
		{para: "13", ans: "3"},
		{para: "4681", ans: "8"},
		{para: "1000000000000000000", ans: "999999999999999999"},
	}

	utils.Segmentation("20210618")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := smallestGoodBase(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
