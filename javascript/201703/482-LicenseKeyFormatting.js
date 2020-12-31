/**
 * @param {string} S
 * @param {number} K
 * @return {string}
 */
var licenseKeyFormatting = function (S, K) {
  var str = S.replace(/-/g, '');
  var ret = [];
  while (str.length >= K) {
    var q = str.length - K;
    ret.push(str.substr(q, K));
    str = str.slice(0, q);
  }
  if (str.length > 0) {
    ret.push(str);
  }
  return ret.reverse().join('-').toUpperCase();
};

var Test = require('../utils').runTest;
var test_case = [
  [[ '2-4A0r7-4k', 3 ], '24-A0R-74K' ],
  [[ '2-4A0r7-4k', 4 ], '24A0-R74K' ],
];

Test(test_case, licenseKeyFormatting);
