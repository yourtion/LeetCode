package utils

import (
	"fmt"
	"reflect"
	"testing"
)

func TestListNode(t *testing.T) {
	tests := [][]int{
		{1, 2, 3, 4, 5},
		{},
	}
	strings := []string{
		"ListNode{ 1 -> 2 -> 3 -> 4 -> 5 }",
		"ListNode{  }",
	}
	for i, tt := range tests {
		name := fmt.Sprintf("ListNode: %v", tt)
		t.Run(name, func(t *testing.T) {
			got := NewListNode(tt)
			res := got.ToIntArr()
			if !reflect.DeepEqual(res, tt) {
				t.Errorf("NewListNode() = %v, want %v", res, tt)
			}
			str := got.String()
			if str != strings[i] {
				t.Errorf("String() = %v, want %v", str, strings[i])
			}
		})
	}
}
