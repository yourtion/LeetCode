package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210105(t *testing.T) {
	type params struct {
		para string
		ans  [][]int
	}
	qs := []params{
		{
			para: "abbxxxxzzy",
			ans:  [][]int{{3, 6}},
		},
		{
			para: "abc",
			ans:  [][]int{},
		},
		{
			para: "abcdddeeeeaabbbcd",
			ans:  [][]int{{3, 5}, {6, 9}, {12, 14}},
		},
		{
			para: "aaa",
			ans:  [][]int{{0, 2}},
		},
	}

	utils.Segmentation("20210105")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := largeGroupPositions(p)
		fmt.Printf("【input】:%v \t【output】:%v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
