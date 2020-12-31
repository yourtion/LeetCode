/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function (x) {
  if (x < 0) return false;
  if (x < 10) return true;
  x = x.toString();
  var x_array = x.split('');
  var length = x_array.length;
  var half_length = parseInt(length / 2, 10);
  for (var i = 0; i < half_length + 1; i++) {
    if (x_array[i] !== x_array[length - i - 1]) return false;
  }
  return true;
};

function Test(){
  var test_case = [
    [ 12321, true ],
    [ -12321, false ],
    [ 1, true ],
    [ -1, false ],
    [ 123, false ],
    [ 1181881811, true ],
    [ -2147447412, false ],
  ];
  var count = 0;
  test_case.forEach(function (test) {
    var res = isPalindrome(test[0]);
    if (res === test[1]){
      count += 1;
      // console.log("->" + test[0] + "Done");
    }else {
      console.log('!!! `' + test[0] + '` expext : `' + test[1] + '` get : `' + res + '`');
    }
  });
  console.log('Test : ' + count + '/' + test_case.length);
}

Test();
