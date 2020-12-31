/**
 * @param {number} capacity
 */
var LFUCache = function (capacity) {
  this.capacity = capacity;
  this.cache = {};
  this.cacheCount1 = {};
  this.cacheCount2 = {};
  this.tmpCount = 0;
};

/**
 * @param {number} key
 * @return {number}
 */
LFUCache.prototype.get = function (key) {
  var ret = this.cache[key];
  if(ret !== undefined) {
    this.tmpCount += 1;
    this.cacheCount1[key] += 1;
    this.cacheCount2[key] = this.tmpCount;
  } else {
    ret = -1;
  }
  return ret;
};

/**
 * @param {number} key
 * @param {number} value
 * @return {void}
 */
LFUCache.prototype.put = function (key, value) {
  if(this.capacity === 0) return;
  var ret = this.cache[key];
  this.tmpCount += 1;
  if(ret === undefined && Object.keys(this.cache).length >= this.capacity) {
    var keysSorted = Object.keys(this.cache).sort((a, b) => {
      if (this.cacheCount1[a] !== this.cacheCount1[b]) {
        return (this.cacheCount1[a] - this.cacheCount1[b]);
      }
      return (this.cacheCount2[a] - this.cacheCount2[b]);
    });
    // console.log(key, value, keysSorted, this.cacheCount);
    var dk = keysSorted[0];
    delete this.cache[dk];
    delete this.cacheCount1[dk];
    delete this.cacheCount2[dk];
  }
  this.cache[key] = value;
  if(ret !== undefined) {
    this.cacheCount1[key] += 1;
    this.cacheCount2[key] = this.tmpCount;
  } else {
    this.cacheCount1[key] = 0;
    this.cacheCount2[key] = this.tmpCount;
  }
};

var test17 = [];
test17[0] = [ 'LFUCache', 'put', 'put', 'put', 'put', 'put', 'get', 'put', 'get', 'get', 'put', 'get', 'put', 'put', 'put', 'get', 'put', 'get', 'get', 'get', 'get', 'put', 'put', 'get', 'get', 'get', 'put', 'put', 'get', 'put', 'get', 'put', 'get', 'get', 'get', 'put', 'put', 'put', 'get', 'put', 'get', 'get', 'put', 'put', 'get', 'put', 'put', 'put', 'put', 'get', 'put', 'put', 'get', 'put', 'put', 'get', 'put', 'put', 'put', 'put', 'put', 'get', 'put', 'put', 'get', 'put', 'get', 'get', 'get', 'put', 'get', 'get', 'put', 'put', 'put', 'put', 'get', 'put', 'put', 'put', 'put', 'get', 'get', 'get', 'put', 'put', 'put', 'get', 'put', 'put', 'put', 'get', 'put', 'put', 'put', 'get', 'get', 'get', 'put', 'put', 'put', 'put', 'get', 'put', 'put', 'put', 'put', 'put', 'put', 'put' ];
test17[1] = [[ 10 ], [ 10, 13 ], [ 3, 17 ], [ 6, 11 ], [ 10, 5 ], [ 9, 10 ], [ 13 ], [ 2, 19 ], [ 2 ], [ 3 ], [ 5, 25 ], [ 8 ], [ 9, 22 ], [ 5, 5 ], [ 1, 30 ], [ 11 ], [ 9, 12 ], [ 7 ], [ 5 ], [ 8 ], [ 9 ], [ 4, 30 ], [ 9, 3 ], [ 9 ], [ 10 ], [ 10 ], [ 6, 14 ], [ 3, 1 ], [ 3 ], [ 10, 11 ], [ 8 ], [ 2, 14 ], [ 1 ], [ 5 ], [ 4 ], [ 11, 4 ], [ 12, 24 ], [ 5, 18 ], [ 13 ], [ 7, 23 ], [ 8 ], [ 12 ], [ 3, 27 ], [ 2, 12 ], [ 5 ], [ 2, 9 ], [ 13, 4 ], [ 8, 18 ], [ 1, 7 ], [ 6 ], [ 9, 29 ], [ 8, 21 ], [ 5 ], [ 6, 30 ], [ 1, 12 ], [ 10 ], [ 4, 15 ], [ 7, 22 ], [ 11, 26 ], [ 8, 17 ], [ 9, 29 ], [ 5 ], [ 3, 4 ], [ 11, 30 ], [ 12 ], [ 4, 29 ], [ 3 ], [ 9 ], [ 6 ], [ 3, 4 ], [ 1 ], [ 10 ], [ 3, 29 ], [ 10, 28 ], [ 1, 20 ], [ 11, 13 ], [ 3 ], [ 3, 12 ], [ 3, 8 ], [ 10, 9 ], [ 3, 26 ], [ 8 ], [ 7 ], [ 5 ], [ 13, 17 ], [ 2, 27 ], [ 11, 15 ], [ 12 ], [ 9, 19 ], [ 2, 15 ], [ 3, 16 ], [ 1 ], [ 12, 17 ], [ 9, 1 ], [ 6, 19 ], [ 4 ], [ 5 ], [ 5 ], [ 8, 1 ], [ 11, 7 ], [ 5, 2 ], [ 9, 28 ], [ 1 ], [ 2, 2 ], [ 7, 4 ], [ 4, 22 ], [ 7, 24 ], [ 9, 26 ], [ 13, 28 ], [ 11, 26 ]];
test17[2] = [ null, null, null, null, null, null, -1, null, 19, 17, null, -1, null, null, null, -1, null, -1, 5, -1, 12, null, null, 3, 5, 5, null, null, 1, null, -1, null, 30, 5, 30, null, null, null, -1, null, -1, 24, null, null, 18, null, null, null, null, 14, null, null, 18, null, null, 11, null, null, null, null, null, 18, null, null, -1, null, 4, 29, 30, null, 12, 11, null, null, null, null, 29, null, null, null, null, 17, -1, 18, null, null, null, -1, null, null, null, 20, null, null, null, 29, 18, 18, null, null, null, null, 20, null, null, null, null, null, null, null ];

var Test = require('../utils').runTestClass;
var test_case = [
  [[ 'LFUCache', 'put', 'put', 'get' ], [[ 2 ], [ 3, 1 ], [ 0, 0 ], [ 0 ]], [ null, null, null, 0 ]],
  [[ 'LFUCache', 'put', 'get' ], [[ 0 ], [ 3, 1 ], [ 3 ]], [ null, null, -1 ]],
  [[ 'LFUCache', 'put', 'put', 'put', 'put', 'get' ], [[ 2 ], [ 3, 1 ], [ 2, 1 ], [ 2, 2 ], [ 4, 4 ], [ 2 ]], [ null, null, null, null, null, 2 ]],
  test17,
];

Test(test_case, LFUCache);
