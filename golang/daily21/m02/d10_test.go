package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210210(t *testing.T) {
	type params struct {
		para1 string
		para2 string
		ans   bool
	}
	qs := []params{
		{
			para1: "ab",
			para2: "eidbaooo",
			ans:   true,
		},
		{
			para1: "ab",
			para2: "eidboaoo",
			ans:   false,
		},
	}

	utils.Segmentation("20210210")

	for _, q := range qs {
		ret, s1, s2 := q.ans, q.para1, q.para2
		res := checkInclusion(s1, s2)
		fmt.Printf("【input】: %s %s \t【output】: %v\n", s1, s2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
