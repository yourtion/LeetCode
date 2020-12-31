/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function (strs) {
  var strs_length = strs.length;
  if (strs_length === 0) return '';
  if (strs_length === 1) return strs[0];
  var str_arr = strs.sort(function (a, b) {
    return a.length - b.length;
  });
  var prefix_array = str_arr[0].split('');
  for (var i = 1; i < strs_length; i++) {
    var i_array = str_arr[i].split('');
    var i_length = i_array.length;
    var l_length = prefix_array.length;
    var longest_length = l_length < i_length ? l_length : i_length ;
    for (var j = 0; j < longest_length; j++) {
      if(i_array[j] !== prefix_array[j]) {
        prefix_array = prefix_array.slice(0, j);
      }
    }
  }
  return prefix_array.join('');
};

function Test(){
  var test_case = [
    [[], '' ],
     [[ 'abcabcbb', 'abc' ], 'abc' ],
  ];
  var count = 0;
  test_case.forEach(function (test) {
    var res = longestCommonPrefix(test[0]);
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
