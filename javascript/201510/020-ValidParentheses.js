/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function (s) {
  var s_length = s.length;
  if (s_length % 2 !== 0) return false;
  var tmp_arr = [];
  for (var i = 0; i < s_length; i++) {
    var str = s[i];
    var str_p = str === '(' ? ')' : str === '{' ? '}' : str === '[' ? ']' : undefined;
    if (str_p) {
      tmp_arr.push(str_p);
    } else {
      var tmp_str = tmp_arr.pop();
      if (tmp_str !== str) {
        return false;
      }
    }
  }
  if (tmp_arr.length > 0){
    return false;
  }
  return true;
};


function Test(){
  var test_case = [
    [ '()', true ],
     [ '(', false ],
     [ '()[]{}', true ],
     [ '([)]', false ],
     [ '(]', false ],
     [ '{([])}()', true ],
  ];
  var count = 0;
  test_case.forEach(function (test) {
    var res = isValid(test[0]);
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
