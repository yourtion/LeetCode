package y2021m06

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210625(t *testing.T) {
	type params struct {
		para1 []string
		para2 string
		ans   int
	}
	qs := []params{
		{
			para1: []string{"0201", "0101", "0102", "1212", "2002"},
			para2: "0202",
			ans:   6,
		},
		{
			para1: []string{"8888"},
			para2: "0009",
			ans:   1,
		},
		{
			para1: []string{"8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"},
			para2: "8888",
			ans:   -1,
		},
		{
			para1: []string{"0000"},
			para2: "8888",
			ans:   -1,
		},
	}

	utils.Segmentation("20210625")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := openLock(p1, p2)
		fmt.Printf("【input】: %v %s \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
