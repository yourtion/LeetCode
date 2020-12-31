/**
 * @param {string} str
 * @returns {string}
 */
var reverseWords = function (str) {
  var str_array = str.split(' ');
  str_array = str_array.clean('');
  if (str_array.length === 1) return str_array[0];
  str_array = str_array.reverse();
  return str_array.join(' ');
};

Array.prototype.clean = function (deleteValue) {
  for (var i = 0; i < this.length; i++) {
    if (this[i] === deleteValue) {
      // 返回指定的元素
      this.splice(i, 1);
      i -= 1;
    }
  }
  return this;
};

function Test(){
  var test_case = [
    [ 'the sky is blue', 'blue is sky the' ],
     [ ' ', '' ],
     [ '    ', '' ],
     [ ' 1', '1' ],
  ];
  var count = 0;
  test_case.forEach(function (test) {
    var res = reverseWords(test[0]);
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
