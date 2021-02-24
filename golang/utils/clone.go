package utils

func DeepCloneIntSlice(p []int) []int {
	ret := make([]int, len(p))
	copy(ret, p)
	return ret
}

func DeepCloneIntSlice2d(p [][]int) [][]int {
	ret := make([][]int, len(p))
	for i, v := range p {
		ret[i] = make([]int, len(v))
		copy(ret[i], v)
	}
	return ret
}
