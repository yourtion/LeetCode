/**
 * @param {string} path
 * @return {string}
 */
var simplifyPath = function (path) {
  var path_array = path.split('/');
  var path_array_length = path_array.length ;
  if (path_array_length < 1) return;
  if (path_array_length === 1) return '/';
  var res_array = [];
  for (var i = 0; i < path_array_length; i++) {
    var loc = path_array[i];
    if (loc === '' || loc === '.') continue;
    if (loc === '..') {
      res_array.pop();
      continue;
    }
    res_array.push(loc);
  }
  return '/' + res_array.join('/');
};


function Test(){
  var test_case = [
    [ '/home/', '/home' ],
     [ '/', '/' ],
     [ '/a/./b/../../c/', '/c' ],
     [ '/home//foo/', '/home/foo' ],
     [ '/.', '/' ],
     [ '/./', '/' ],
     [ '/../', '/' ],
     [ '/...', '/...' ],
     [ '/abc/...', '/abc/...' ],
  ];
  var count = 0;
  test_case.forEach(function (test) {
    var res = simplifyPath(test[0]);
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
