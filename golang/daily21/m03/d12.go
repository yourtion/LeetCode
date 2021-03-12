package y2021m03

// 每日一题 20210312
//
// 331. 验证二叉树的前序序列化
// Link: https://leetcode-cn.com/problems/verify-preorder-serialization-of-a-binary-tree/
func isValidSerialization(preorder string) bool {
	n := len(preorder)
	slots := 1
	for i := 0; i < n; {
		if slots == 0 {
			return false
		}
		if preorder[i] == ',' {
			i++
		} else if preorder[i] == '#' {
			slots--
			i++
		} else {
			// 读一个数字
			for i < n && preorder[i] != ',' {
				i++
			}
			slots++ // slots = slots - 1 + 2
		}
	}
	return slots == 0
}
