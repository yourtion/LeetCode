package y2021m03

import "container/list"

// 每日一题 20210314
//
// 706. 设计哈希映射
// Link: https://leetcode-cn.com/problems/design-hashmap/
type MyHashMap struct {
	buckets []list.List
}

const BucketCount2 = 769

type myHashMapVal struct {
	key int
	val int
}

/** Initialize your data structure here. */
func ConstructorMyHashMap() MyHashMap {
	return MyHashMap{buckets: make([]list.List, BucketCount2)}
}

func (m *MyHashMap) hash(key int) int {
	return key % BucketCount2
}

/** value will always be non-negative. */
func (m *MyHashMap) Put(key int, value int) {
	h := m.hash(key)
	for e := m.buckets[h].Front(); e != nil; e = e.Next() {
		if e.Value.(myHashMapVal).key == key {
			e.Value = myHashMapVal{key: key, val: value}
			return
		}
	}
	m.buckets[h].PushFront(myHashMapVal{key: key, val: value})
}

/** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
func (m *MyHashMap) Get(key int) int {
	h := m.hash(key)
	for e := m.buckets[h].Front(); e != nil; e = e.Next() {
		if e.Value.(myHashMapVal).key == key {
			return e.Value.(myHashMapVal).val
		}
	}
	return -1
}

/** Removes the mapping of the specified value key if this map contains a mapping for the key */
func (m *MyHashMap) Remove(key int) {
	h := m.hash(key)
	for e := m.buckets[h].Front(); e != nil; e = e.Next() {
		if e.Value.(myHashMapVal).key == key {
			m.buckets[h].Remove(e)
		}
	}
}
