package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210526(t *testing.T) {
	type params struct {
		para string
		ans  string
	}
	qs := []params{
		{para: "(abcd)", ans: "dcba"},
		{para: "(u(love)i)", ans: "iloveu"},
		{para: "(ed(et(oc))el)", ans: "leetcode"},
		{para: "a(bcdefghijkl(mno)p)q", ans: "apmnolkjihgfedcbq"},
	}

	utils.Segmentation("20210526")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := reverseParentheses(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
