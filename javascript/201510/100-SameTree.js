/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {boolean}
 */
var isSameTree = function (p, q) {
  if (p === null && q === null){
    return true;
  }else if (p === null) {
    return false;
  }else if (q === null) {
    return false;
  }
  if (p.val !== q.val) return false;
  
  if (p.left === null && q.left !== null) return false;
  if (p.right === null && q.right !== null) return false;
  if (q.left === null && p.left !== null) return false;
  if (q.right === null && p.right !== null) return false;
  return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
};

function TreeNode(val) {
  this.val = val;
  this.left = this.right = null;
}

var p1 = new TreeNode(1);
var q1 = new TreeNode(1);

var p2 = new TreeNode(1);
p2.left = new TreeNode(6);
p2.right = new TreeNode(3);
var q2 = new TreeNode(1);
q2.left = new TreeNode(6);
q2.right = new TreeNode(3);

var p3 = new TreeNode(1);
var q3 = new TreeNode(2);

var p4 = new TreeNode(1);
p4.left = new TreeNode(6);
var q4 = new TreeNode(1);
q4.right = new TreeNode(6);

function Test(){
  var test_case = [
    [[ null, null ], true ],
     [[ null, p1 ], false ],
     [[ p1, q1 ], true ],
     [[ p1, q1 ], true ],
     [[ p3, q3 ], false ],
     [[ p4, q4 ], false ],
  ];
  var count = 0;
  test_case.forEach(function (test) {
    var res = isSameTree(test[0][0], test[0][1]);
    if (res === test[1]){
      count += 1;
      // console.log("->" + test[0] + "Done");
    }else {
      console.log('!!! `' + test[0][1] + test[0][0] + '` expext : `' + test[1] + '` get : `' + res + '`');
    }
  });
  console.log('Test : ' + count + '/' + test_case.length);
}

Test();
