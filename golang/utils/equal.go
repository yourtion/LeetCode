package utils

import "reflect"

// 通过 reflect.DeepEqual 判断两个元素是否全等
func DeepEqual(s1, s2 interface{}) bool {
	return reflect.DeepEqual(s1, s2)
}
