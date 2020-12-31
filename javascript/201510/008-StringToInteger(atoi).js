/**
 * @param {string} str
 * @return {number}
 */
var myAtoi = function (str) {
  if (str === '') return 0;
  var i = parseInt(str, 10);
  if(isNaN(i)) return 0 ;
  if (i > 2147483647){
    i = 2147483647;
  }
  if (i < -2147483648){
    i = -2147483648;
  }
  return i;
};

function Test(){
  var test_case = [
    [ '', 0 ],
    [ '+', 0 ],
    [ '123', 123 ],
    [ '-1', -1 ],
    [ '2147483648', 2147483647 ],
    [ '-2147483648', -2147483648 ],
    [ '-2147483649', -2147483648 ],
  ];
  var count = 0;
  test_case.forEach(function (test) {
    var res = myAtoi(test[0]);
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
