/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function (head, n) {
  if (head.next === null && n === 1) return null;
  var nodeList = [];
  var node = head;
  while (node) {
    nodeList.push(node);
    node = getNode(node);
  }
  var node_length = nodeList.length;
  if (node_length === n) return nodeList[1];
  var node_pos = node_length - n;
  if (n > 0 && node_length - n >= 1){
    nodeList[node_pos - 1].next = nodeList[node_pos + 1];
  } return head;
};

function getNode(n) {
  if (n.next === null) return;
  return n.next;
}

function ListNode(val) {
  this.val = val;
  this.next = null;
}

function ListNodeString(l) {
  var res = [];
  var hasNext = true;
  var node = l;
  while (hasNext) {
    res.push(node.val);
    if (node.next){
      node = node.next;
    }else {
      hasNext = false;
    }
  }
  return res.join(' -> ');
}

// function printListNode(node) {
//   console.log(ListNodeString(node));
// }

var l1 = new ListNode(2);
var l2 = l1.next = new ListNode(4);
var l3 = l2.next = new ListNode(3);
var l4 = l3.next = new ListNode(6);
l4.next = new ListNode(4);

console.log(ListNodeString(l1));
console.log(ListNodeString(removeNthFromEnd(l1, 2)), ' === 2 -> 4 -> 3 -> 4');

var l7 = new ListNode(1);
var l8 = l7.next = new ListNode(2);
l8.next = new ListNode(3);
console.log(ListNodeString(l7));
console.log(ListNodeString(removeNthFromEnd(l7, 1)), ' === 2');
