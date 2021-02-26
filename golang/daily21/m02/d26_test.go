package y2021m02

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210226(t *testing.T) {
	type params struct {
		para1 []string
		para2 []string
		ans   []int
	}
	qs := []params{
		{
			para1: []string{"aaaa", "asas", "able", "ability", "actt", "actor", "access"},
			para2: []string{"aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"},
			ans:   []int{1, 1, 3, 2, 4, 0},
		},
	}

	utils.Segmentation("20210226")

	for _, q := range qs {
		ret, p1, p2 := q.ans, q.para1, q.para2
		res := findNumOfValidWords(p1, p2)
		fmt.Printf("【input】: %v %v \t【output】: %v\n", p1, p2, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
