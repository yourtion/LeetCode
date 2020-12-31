/**
 * searchMatrix
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function (matrix, target) {
  var matrix_length = matrix.length;
  for (var i = 0; i < matrix_length; i++) {
    var matrix_row = matrix[i];
    if(target < matrix_row[0]) continue;
    var matrix_row_length = matrix_row.length;
    if(target > matrix_row[matrix_row_length - 1]) continue;
    for (var j = 0; j < matrix_row_length; j++) {
      var res = matrix_row[j];
      if (target === res) return true;
      if (target > res) continue;
    }
  }
  return false;
};


var matrix1 = [
  [ 1, 4, 7, 11, 15 ],
  [ 2, 5, 8, 12, 19 ],
  [ 3, 6, 9, 16, 22 ],
  [ 10, 13, 14, 17, 24 ],
  [ 18, 21, 23, 26, 30 ],
];


function Test(){
  var test_case = [
    [[ matrix1, 15 ], true ],
     [[ matrix1, 20 ], false ],
  ];
  var count = 0;
  test_case.forEach(function (test) {
    var res = searchMatrix(test[0][0], test[0][1]);
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
