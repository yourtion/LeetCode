package y2021m04

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210420(t *testing.T) {
	type params struct {
		para1 string
		para2 string
		ans   int
	}
	qs := []params{
		{
			para1: "hello",
			para2: "ll",
			ans:   2,
		},
		{
			para1: "aaaaa",
			para2: "bba",
			ans:   -1,
		},
		{
			para1: "hello",
			para2: "lo",
			ans:   3,
		},
		{
			para1: "",
			para2: "",
			ans:   0,
		},
		{
			para1: "a",
			para2: "",
			ans:   0,
		},
	}

	utils.Segmentation("20210420")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := strStr(p1, p2)
		fmt.Printf("【input】: %v %v \t【output】: %v\n", p1, p2, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
