package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210617(t *testing.T) {
	type params struct {
		para string
		ans  bool
	}
	qs := []params{
		{para: "0", ans: true},
		{para: "e", ans: false},
		{para: ".", ans: false},
		{para: ".1", ans: true},
	}

	utils.Segmentation("20210617")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := isNumber(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
