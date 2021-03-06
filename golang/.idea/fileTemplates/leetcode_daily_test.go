package y${YEAR}m${MONTH}
import (
	"fmt"
	"testing"
	
	"github.com/yourtion/LeetCode/golang/utils"
)

func Test_${YEAR}${MONTH}${DAY}(t *testing.T) {
    type params struct {
        para string
        ans int
    }
    qs := []params{
		{
			para: "",
			ans:  1,
		},
	}

    utils.Segmentation("${YEAR}${MONTH}${DAY}")

	for _, q := range qs {
		ret, p := q.ans, q.para
		res := 
		fmt.Printf("【input】: %v \t【output】: %v\n", p, res)
		if ret != res {
			t.Errorf(`"%v" not equal to "%v"`, res, ret)
		}
	}
}
