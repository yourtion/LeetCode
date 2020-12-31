/**
 * @param {number} x
 * @return {number}
 */
var reverse = function (x) {
  var hasMinus = x < 0;
  x = x.toString();
  if (hasMinus) x = x.slice(1);
  var x_array = x.split('');
  x_array = x_array.reverse();
  var res = x_array.join('');
  if (hasMinus) res = '-' + res;
  if (res > 2147483647 || res < -2147483647) return 0;
  return parseInt(res, 10);
};

function Test(){
  var test_case = [
    [ 123, 321 ],
    [ -123, -321 ],
    [ 1534236469, 0 ],
    [ 900000, 9 ],
    [ 32768, 86723 ],
  ];
  var count = 0;
  test_case.forEach(function (test) {
    var res = reverse(test[0]);
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
