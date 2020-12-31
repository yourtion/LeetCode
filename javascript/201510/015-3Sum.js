/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function (nums) {
  var res = [];
  nums = nums.sort(function (a, b) {
    return a - b;
  });
  var nums_length = nums.length;
  var num_max = nums[nums_length - 1];
  var value1;
  for (var i = 0; i < nums_length; i++) {
    if(value1 > 0) return res;
    value1 = nums[i];
    for (var j = i + 1; j < nums_length; j++) {
      var value2 = nums[j];
      if(value1 + value2 < num_max * -1) continue;
      for (var k = j + 1; k < nums_length; k++) {
        var value3 = nums[k];
        if(value1 + value2 + value3 === 0) {
          var res_arr = [ value1, value2, value3 ];
          if (!contains(res, res_arr)) {
            res.push(res_arr);
          }
          continue;
        }
      }
    }
  }
  
  return res;
};

function contains(a, obj) {
  var i = a.length;
  while (i--) {
    if (TestArray(a[i], obj)) {
      return true;
    }
  }
  return false;
}

function TestArray(a, b) {
  if (a.length === b.length){
    for (var j = 0; j < a.length; j++) {
      if (a[j] !== b[j]) return false;
    }
    return true;
  }
  return false;
  
}

function Test(){
  var test_case = [
    [[ -1, 0, 1, 2, -1, -4 ], [[ -1, 0, 1 ], [ -1, -1, 2 ]]],
     [[ 3, 0, -2, -1, 1, 2 ], [[ -2, -1, 3 ], [ -2, 0, 2 ], [ -1, 0, 1 ]]],
     [[ -4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6 ], [[ -4, -2, 6 ], [ -4, 0, 4 ], [ -4, 1, 3 ], [ -4, 2, 2 ], [ -2, -2, 4 ], [ -2, 0, 2 ]]],
  ];
  var count = 0;
  var all_count = test_case.length;
  test_case.forEach(function (test, i) {
    var res = threeSum(test[0]);
    if (res.length === test[1].length){
      if (contains(test[1], res[i])){
        count += 1;
      }else {
        console.log('!!! `' + test[0] + '` expext : `' + test[1][i] + '` get : `' + res[i] + '`');
      }

      // console.log("->" + test[0] + "Done");
    } else {
      console.log(res);
      console.log('-- `' + test[0] + '` expext : `' + test[1] + '` get : `' + res + '`');
    }
  });
  console.log('Test : ' + count + '/' + all_count);
}

Test();
