package y2021m03

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210307(t *testing.T) {
	type params struct {
		para string
		ans  [][]string
	}
	qs := []params{
		{
			para: "aab",
			ans:  [][]string{{"a", "a", "b"}, {"aa", "b"}},
		},
	}

	utils.Segmentation("20210307")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := partition(p)
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
