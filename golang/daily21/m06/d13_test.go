package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210613(t *testing.T) {
	type params struct {
		para int
		ans  int
	}
	qs := []params{
		{
			para: 5,
			ans:  4,
		},
	}

	utils.Segmentation("20210613")

	for _, q := range qs {
		ret, p := q.ans, q.para
		isBadVersion = func(v int) bool { return v >= ret }
		res := firstBadVersion(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
