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

func TestLinkedListCombine(t *testing.T) {
	list1 := NewListNode([]int{4, 1, 8, 4, 5})
	list2 := NewListNode([]int{5, 0, 1, 8, 4, 5})
	skip1, skip2 := 2, 3
	LinkedListCombine(list1, list2, skip1, skip2)
	for i := 0; i < skip1; i++ {
		list1 = list1.Next
	}
	for i := 0; i < skip2; i++ {
		list2 = list2.Next
	}
	if list1.Val != 8 || list2.Val != 8 || &list1 != &list2 {
		t.Failed()
	}
}
