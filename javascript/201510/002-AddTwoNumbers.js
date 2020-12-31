/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 * @param {Number} val
 */
function ListNode(val) {
  this.val = val;
  this.next = null;
}

/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function (l1, l2) {
  if (l1.val < 0 || l2.val < 0) return;
  var res;
  var hasNext = true;
  var should_add = false;
  var node;
  while (hasNext || should_add) {
    if (hasNext){
      hasNext = (l1.next != null || l2.next != null);
      var sum = l1.val + l2.val;
      if (should_add) {
        sum = sum + 1;
        should_add = false;
      }
      if (sum > 9){
        should_add = true;
        sum = sum - 10;
      }
      if (res){
        node.next = new ListNode(sum);
        if(hasNext || should_add){
          node = node.next;
        }
      } else {
        res = new ListNode(sum);
        node = res;
      }
      if (l1.next === null){
        l1.next = new ListNode(0);
        
      }
      if (l2.next === null){
        l2.next = new ListNode(0);
      }
      if (hasNext){
        l1 = l1.next;
        l2 = l2.next;
      }
    }else {
      node.next = new ListNode(1);
      should_add = false;
    }
  }
  return res;
};


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
l1.next = new ListNode(4);
l1.next.next = new ListNode(3);

var l2 = new ListNode(5);
l2.next = new ListNode(6);
l2.next.next = new ListNode(4);

console.log('Should : 7 -> 0 -> 8  || ' + ListNodeString(addTwoNumbers(l1, l2)));


var l3 = new ListNode(0);
var l4 = new ListNode(0);

console.log('Should : 0  || ' + ListNodeString(addTwoNumbers(l3, l4)));

var l5 = new ListNode(5);
var l6 = new ListNode(5);

console.log('Should : 0 -> 1 || ' + ListNodeString(addTwoNumbers(l5, l6)));


var l7 = new ListNode(1);
l7.next = new ListNode(8);
var l8 = new ListNode(0);

console.log('Should : 0 -> 1 || ' + ListNodeString(addTwoNumbers(l7, l8)));

var l9 = new ListNode(9);
l9.next = new ListNode(8);
var l10 = new ListNode(1);

console.log('Should : 0 -> 9 || ' + ListNodeString(addTwoNumbers(l10, l9)));


var l11 = new ListNode(9);
l11.next = new ListNode(9);
var l12 = new ListNode(1);

console.log('Should : 0 -> 0 -> 1 || ' + ListNodeString(addTwoNumbers(l12, l11)));
