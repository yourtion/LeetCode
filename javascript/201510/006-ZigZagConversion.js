/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function (s, numRows) {
  if (numRows === 1) return s;
  var s_length = s.length;
  if (s_length <= numRows) return s;
  var res_arr = [];
  var numRows_part = numRows + numRows - 2;
  var numRow_index = numRows - 1;
  for (var i = 0; i < s_length; i++) {
    var row_mod = i % numRows_part;
    if(row_mod > numRow_index) row_mod = numRows_part - row_mod;
    if (!res_arr[row_mod]) {
      res_arr[row_mod] = [ s[i] ];
    } else {
      res_arr[row_mod].push(s[i]);
    }
  }
  var res_arr_length = res_arr.length;
  var res = '';
  for (var j = 0; j < res_arr_length; j++) {
    res = res + res_arr[j].join('');
  }
  return res;
};

function Test(){
  var test_case = [
    [[ 'PAYPALISHIRING', 3 ], 'PAHNAPLSIIGYIR' ],
     [[ 'PAYPALISHIRING', 4 ], 'PINALSIGYAHRPI' ],
     [[ 'PAYPALISHIRING', 5 ], 'PHASIYIRPLIGAN' ],
     [[ 'AB', 1 ], 'AB' ],
  ];
  var count = 0;
  test_case.forEach(function (test) {
    var res = convert(test[0][0], test[0][1]);
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
