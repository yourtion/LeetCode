package y2021m03

// 每日一题 20210301
//
// 303. 区域和检索 - 数组不可变
// Link: https://leetcode-cn.com/problems/range-sum-query-immutable/
type NumArray struct {
	arr []int
}

func ConstructorNumArray(nums []int) NumArray {
	n := len(nums)
	if n < 1 {
		return NumArray{}
	}
	arr := make([]int, n)
	arr[0] = nums[0]
	for i := 1; i < n; i++ {
		arr[i] = arr[i-1] + nums[i]
	}
	return NumArray{arr: arr}
}

func (n *NumArray) SumRange(i int, j int) int {
	if i < 1 {
		return n.arr[j]
	}
	return n.arr[j] - n.arr[i-1]
}
