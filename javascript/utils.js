var assert = require('assert');

module.exports.runTest = function (test_case, fn){
  var count = 0;
  test_case.forEach(function (test) {
    var res = fn.apply(null, test[0]);
    if (res === test[1]){
      assert.deepEqual(res, test[1]);
      count += 1;
			// console.log("->" + test[0] + "Done");
    }else {
      console.log('!!! `' + test[0] + '` expext : `' + test[1] + '` get : `' + res + '`');
    }
  });
  console.log('Test : ' + count + '/' + test_case.length);
};

module.exports.runTestClass = function (test_case, c){
  var count = 0;
  var _class;
  test_case.forEach(function (test) {
    var ret = true;
    test[0].forEach(function (action, i) {
      var value = test[1][i];
      var res;
      if(c.name && action === c.name) {
        _class = new c(value[0]);
      } else {
        res = _class[action].apply(_class, value);
      }
      if (test[2][i] === null || res === test[2][i]){
        assert.deepEqual(res, test[2][i]);
        // console.log("->" + test[0] + "Done");
      }else {
        ret = false;
        console.log('!!! `' + action + ':' + value + '` expext : `' + test[2][i] + '` get : `' + res + '`');
      }
    });
    if(ret) count += 1;
  });
  console.log('Test : ' + count + '/' + test_case.length);
};
