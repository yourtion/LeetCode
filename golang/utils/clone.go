package utils

func DeepCloneIntSlice(p []int) []int {
	ret := make([]int, len(p))
	copy(ret, p)
	return ret
}
