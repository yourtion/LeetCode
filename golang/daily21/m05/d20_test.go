package y2021m05

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210520(t *testing.T) {
	type params struct {
		para1 []string
		para2 int
		ans   []string
	}
	qs := []params{
		{
			para1: []string{"i", "love", "leetcode", "i", "love", "coding"},
			para2: 2,
			ans:   []string{"i", "love"},
		},
		{
			para1: []string{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"},
			para2: 4,
			ans:   []string{"the", "is", "sunny", "day"},
		},
	}

	utils.Segmentation("20210520")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := topKFrequent(p1, p2)
		fmt.Printf("【input】: %v %d \t【output】: %v\n", p1, p2, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
