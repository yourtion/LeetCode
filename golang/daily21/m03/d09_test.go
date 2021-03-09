package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210309(t *testing.T) {
	type params struct {
		para string
		ans  string
	}
	qs := []params{
		{
			para: "abbaca",
			ans:  "ca",
		},
	}

	utils.Segmentation("20210309")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := removeDuplicates(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
