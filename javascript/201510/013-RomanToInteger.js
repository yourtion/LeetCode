/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function (s) {
  var str_arr = s.split('');

  var valueI = stringCount(str_arr, 'I', 1, [ 'V', 'X', 'L', 'C', 'M', 'D' ]);
  var valueV = stringCount(str_arr, 'V', 5);
  var valueX = stringCount(str_arr, 'X', 10, [ 'L', 'C', 'M', 'D' ]);
  var valueL = stringCount(str_arr, 'L', 50);
  var valueC = stringCount(str_arr, 'C', 100, [ 'M', 'D' ]);
  var valueD = stringCount(str_arr, 'D', 500);
  var valueM = stringCount(str_arr, 'M', 1000);
  console.log(valueI, valueV, valueX, valueL, valueC, valueD, valueM);
  return valueI + valueV + valueX + valueL + valueC + valueD + valueM;
};

function stringCount(str_arr, char, value, patten) {
  var count = 0;
  if (str_arr.indexOf(char) === -1) return count;
  var length = str_arr.length;
  for (var i = 0; i < length; i++) {
    var str = str_arr[i];
    if(str === char){
      count = count + value;
      if (patten){
        if (str_arr[i + 1] && patten.indexOf(str_arr[i + 1]) !== -1){
          count = count * -1;
        }
      }
    }
  }
  return count;
}

function Test(){
  var test_case = [
    [ 'I', 1 ],
     [ 'II', 2 ],
     [ 'V', 5 ],
     [ 'VI', 6 ],
     [ 'IV', 4 ],
     [ 'DCXXI', 621 ],
  ];
  var count = 0;
  test_case.forEach(function (test) {
    var res = romanToInt(test[0]);
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
