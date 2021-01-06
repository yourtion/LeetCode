package y2021m01

import (
	"fmt"
	"testing"

	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_20210106(t *testing.T) {
	type params struct {
		para1 [][]string
		para2 []float64
		para3 [][]string
		ans   []float64
	}
	qs := []params{
		{
			para1: [][]string{{"a", "b"}, {"b", "c"}},
			para2: []float64{2.0, 3.0},
			para3: [][]string{{"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"}},
			ans:   []float64{6.00000, 0.50000, -1.00000, 1.00000, -1.00000},
		},
		{
			para1: [][]string{{"a", "b"}, {"b", "c"}, {"bc", "cd"}},
			para2: []float64{1.5, 2.5, 5.0},
			para3: [][]string{{"a", "c"}, {"c", "b"}, {"bc", "cd"}, {"cd", "bc"}},
			ans:   []float64{3.75000, 0.40000, 5.00000, 0.20000},
		},
		{
			para1: [][]string{{"a", "b"}},
			para2: []float64{0.5},
			para3: [][]string{{"a", "b"}, {"b", "a"}, {"a", "c"}, {"x", "y"}},
			ans:   []float64{0.50000, 2.00000, -1.00000, -1.00000},
		},
	}

	utils.Segmentation("20210106")

	for _, q := range qs {
		ret, p1, p2, p3 := q.ans, q.para1, q.para2, q.para3
		res := calcEquation(p1, p2, p3)
		fmt.Printf("【input】:%v %v %v \t【output】:%v\n", p1, p2, p3, res)
		if !utils.DeepEqual(ret, res) {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
