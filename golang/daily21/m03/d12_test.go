package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210312(t *testing.T) {
	type params struct {
		para string
		ans  bool
	}
	qs := []params{
		{
			para: "9,3,4,#,#,1,#,#,2,#,6,#,#",
			ans:  true,
		},
		{
			para: "1,#",
			ans:  false,
		},
		{
			para: "9,#,#,1",
			ans:  false,
		},
	}

	utils.Segmentation("20210312")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := isValidSerialization(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
